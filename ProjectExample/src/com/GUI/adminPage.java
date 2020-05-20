package com.GUI;

import com.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

public class adminPage extends Container {
    private JComboBox priceAdult, priceStudent, priceChild, priceCola, pricePop;
    private JButton buttonNext, buttonBack;
    private JLabel cola;
    private JLabel popcorn;
    private JLabel fon;
    private JLabel studentLabel;
    private JLabel childLabel;
    private JLabel adultLabel;

    public adminPage(){
        setSize(900,600);
        setLayout(null);

        Integer []ages=new Integer[200];
        int k = 0;
        for (int i = 0; i < 200 ; i++) {
            ages[i] = k+50;
            k=ages[i];
        }

        priceAdult=new JComboBox(ages);
        priceAdult.setBounds(450,150,100,30);
        add(priceAdult);

        priceStudent=new JComboBox(ages);
        priceStudent.setBounds(450,200,100,30);
        add(priceStudent);

        priceChild=new JComboBox(ages);
        priceChild.setBounds(450,250,100,30);
        add(priceChild);

        priceCola=new JComboBox(ages);
        priceCola.setBounds(450,300,100,30);
        add(priceCola);

        pricePop=new JComboBox(ages);
        pricePop.setBounds(450,350,100,30);
        add( pricePop);

        popcorn=new JLabel();
        ImageIcon iconpop=createIcon("/com/posters/pop.jpg");
        popcorn.setIcon(iconpop);
        popcorn.setBounds(250,350,100,30);
        add(popcorn);

        cola=new JLabel();
        ImageIcon iconcola=createIcon("/com/posters/cola.jpg");
        cola.setIcon(iconcola);
        cola.setBounds(250,300,100,30);
        add(cola);

        childLabel=new JLabel();
        ImageIcon iconchild=createIcon("/com/posters/child.jpg");
        childLabel.setIcon(iconchild);
        childLabel.setBounds(250,250,100,30);
        add(childLabel);

        studentLabel=new JLabel();
        ImageIcon iconstud=createIcon("/com/posters/st.jpg");
        studentLabel.setIcon(iconstud);
        studentLabel.setBounds(250,200,100,30);
        add(studentLabel);

        adultLabel=new JLabel();
        ImageIcon iconadult=createIcon("/com/posters/adult.jpg");
        adultLabel.setIcon(iconadult);
        adultLabel.setBounds(250,150,100,30);
        add(adultLabel);

        buttonNext = new JButton("Save");
        buttonNext.setBounds(380, 510, 80, 30);
        buttonNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int priceA,priceS,priceCH,priceC,priceP;
                priceA=(Integer)priceAdult.getSelectedItem();
                priceS=(Integer)priceStudent.getSelectedItem();
                priceCH=(Integer)priceChild.getSelectedItem();
                priceC=(Integer)priceCola.getSelectedItem();
                priceP=(Integer)pricePop.getSelectedItem();
                String fullInfo;
                fullInfo=priceA+"-"+priceS+"-"+priceCH+"-"+priceC+"-"+priceP;
                JOptionPane.showMessageDialog(null, "Saved!");

                try {
                    FileWriter writer = new FileWriter("price.txt");
                    writer.write(fullInfo);
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                Main.frame.adminpage.setVisible(false);
                Main.frame.menuWindow.setVisible(true);
            }
        });
        add(buttonNext);

        JLabel label = new JLabel();
        ImageIcon icon1 = createIcon("/images/4.jpg");
        label.setBounds(0, 0, 900, 600);
        label.setIcon(icon1);
        add(label);
    }

    protected static ImageIcon createIcon (String path){
        URL imgURL = RegistrationGUI.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("File not found " + path);
            return null;
        }
    }
}
