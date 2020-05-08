package com.GUI;

import com.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

public class Food extends Container {
    private JComboBox comboCola;
    private JComboBox comboPopcorn;
    private JButton buttonNext;
    private JButton buttonBack;
    private JLabel cola;
    private JLabel popcorn;
    private JLabel fon;

    public Food(){
        setSize(900,600);
        setLayout(null);

        Integer []ages=new Integer[6];
        for (int i = 0; i <6 ; i++) {
            ages[i]=i;
        }

        comboCola=new JComboBox(ages);
        comboCola.setBounds(450,300,100,30);
        add(comboCola);

        comboPopcorn=new JComboBox(ages);
        comboPopcorn.setBounds(450,350,100,30);
        add(comboPopcorn);

        cola=new JLabel();
        ImageIcon iconchild=createIcon("/com/posters/cola.jpg");
        cola.setIcon(iconchild);
        cola.setBounds(250,300,100,30);
        add(cola);

        JLabel tg200 = new JLabel();
        ImageIcon icon200=createIcon("/com/posters/200.jpeg");
        tg200.setIcon(icon200);
        tg200.setBounds(350,300,100,30);
        add(tg200);

        popcorn=new JLabel();
        ImageIcon iconstud=createIcon("/com/posters/pop.jpg");
        popcorn.setIcon(iconstud);
        popcorn.setBounds(250,350,100,30);
        add(popcorn);

        JLabel tg1200 = new JLabel();
        ImageIcon icon1200=createIcon("/com/posters/1200.jpeg");
        tg1200.setIcon(icon1200);
        tg1200.setBounds(350,350,100,30);
        add(tg1200);


        buttonNext = new JButton("NEXT");
        buttonNext.setBounds(780, 510, 80, 30);
        buttonNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int countCola,countPopcorn;
                countCola=(Integer)comboCola.getSelectedItem();
                countPopcorn=(Integer)comboPopcorn.getSelectedItem();
                String fullInfo=countCola+"-"+countPopcorn;
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt",true));
                    writer.write(fullInfo);
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                Main.frame.food.setVisible(false);
                Main.frame.bill.setVisible(true);

            }
        });
        add(buttonNext);

        buttonBack = new JButton("BACK");
        buttonBack.setBounds(20, 510, 80, 30);
        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.food.setVisible(false);
                Main.frame.selectMovieWindow.setVisible(true);

            }
        });
        add(buttonBack);

        JLabel fone = new JLabel();
        ImageIcon icon = createIcon("/com/posters/food.jpg");
        fone.setBounds(0,0,900,600);
        fone.setIcon(icon);
        add(fone);

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
