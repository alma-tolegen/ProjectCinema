package com.GUI;

import com.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
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
        BufferedReader read=null;
        try {
            String text;
            read=new BufferedReader(new FileReader("price.txt"));
            text=read.readLine();
            String[] subStr;
            String delimeter = "-";
            subStr = text.split(delimeter);
            int priceCola=Integer.parseInt(subStr[3].trim());
            int pricePop=Integer.parseInt(subStr[4].trim());

            Font font = new Font("Arial", Font.BOLD, 25);


            font = new Font("Arial", Font.BOLD, 20);
            String tgStudent=priceCola+" KZT";
            JLabel tg200 = new JLabel(tgStudent);
            tg200.setFont(font);
            tg200.setBounds(510,300,100,30);
            tg200.setForeground(Color.black);
            add(tg200);

            font = new Font("Arial", Font.BOLD, 20);
            String tgAdult=pricePop+" KZT";
            JLabel tg1200 = new JLabel(tgAdult);
            tg1200.setFont(font);
            tg1200.setBounds(510,350,100,30);
            tg1200.setForeground(Color.black);
            add(tg1200);



        } catch (IOException ex) {
            ex.printStackTrace();
        }


        setSize(900,600);
        setLayout(null);

        Integer []ages=new Integer[6];
        for (int i = 0; i <6 ; i++) {
            ages[i]=i;
        }

        comboCola=new JComboBox(ages);
        comboCola.setBounds(400,300,100,30);
        add(comboCola);

        comboPopcorn=new JComboBox(ages);
        comboPopcorn.setBounds(400,350,100,30);
        add(comboPopcorn);

        cola=new JLabel();
        ImageIcon iconchild=createIcon("/com/posters/cola.jpg");
        cola.setIcon(iconchild);
        cola.setBounds(290,300,100,30);
        add(cola);

        popcorn=new JLabel();
        ImageIcon iconstud=createIcon("/com/posters/pop.jpg");
        popcorn.setIcon(iconstud);
        popcorn.setBounds(290,350,100,30);
        add(popcorn);

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
