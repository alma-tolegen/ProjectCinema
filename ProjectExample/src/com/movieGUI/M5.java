package com.movieGUI;

import com.Main;
import com.GUI.RegistrationGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

public class M5 extends Container {
    private JLabel fone;
    private JLabel titel;
    private JButton buttonBack;
    JComboBox chisla;
    private JComboBox chisla1;
    private JComboBox chisla2;
    private JLabel studentLabel;
    private JLabel childLabel;
    private JLabel adultLabel;
    private JCheckBox food;
    private JButton buttonNext;
    private JLabel opisanie;

    public M5(){
        BufferedReader read=null;
        try {
            String text;
            read=new BufferedReader(new FileReader("price.txt"));
            text=read.readLine();
            String[] subStr;
            String delimeter = "-";
            subStr = text.split(delimeter);
            int priceA=Integer.parseInt(subStr[0].trim());
            int priceS=Integer.parseInt(subStr[1].trim());
            int priceCH=Integer.parseInt(subStr[2].trim());
            Font font = new Font("Arial", Font.BOLD, 25);


            titel=new JLabel("Хищные птицы");
            titel.setBounds(360,50,350,30);
            titel.setForeground(Color.WHITE);
            titel.setFont(font);
            add(titel);

            childLabel=new JLabel();
            ImageIcon iconchild=createIcon("/com/posters/child.jpg");
            childLabel.setIcon(iconchild);
            childLabel.setBounds(290,300,100,30);
            add(childLabel);

            font = new Font("Arial", Font.BOLD, 20);
            String tgChild=priceCH+" KZT";
            JLabel tg800 = new JLabel(tgChild);
            tg800.setFont(font);
            tg800.setBounds(510,300,100,30);
            tg800.setForeground(Color.red);
            add(tg800);

            studentLabel=new JLabel();
            ImageIcon iconstud=createIcon("/com/posters/st.jpg");
            studentLabel.setIcon(iconstud);
            studentLabel.setBounds(290,350,100,30);
            add(studentLabel);

            font = new Font("Arial", Font.BOLD, 20);
            String tgStudent=priceS+" KZT";
            JLabel tg1000 = new JLabel(tgStudent);
            tg1000.setFont(font);
            tg1000.setBounds(510,350,100,30);
            tg1000.setForeground(Color.red);
            add(tg1000);

            adultLabel=new JLabel();
            ImageIcon iconadult=createIcon("/com/posters/adult.jpg");
            adultLabel.setIcon(iconadult);
            adultLabel.setBounds(290,400,100,30);
            add(adultLabel);

            font = new Font("Arial", Font.BOLD, 20);
            String tgAdult=priceA+" KZT";
            JLabel tg1200 = new JLabel(tgAdult);
            tg1200.setFont(font);
            tg1200.setBounds(510,400,100,30);
            tg1200.setForeground(Color.red);
            add(tg1200);

            font = new Font("Arial", Font.BOLD, 15);
            String s = "<html>" +
                    "<p align = center> A twisted tale told by Harley Quinn herself, when Gotham's most  " + "</p>" +
                    "<p align = center> nefariously narcissistic villain, Roman Sionis, and his zealous right-  " + "</p>" +
                    "<p align = center> hand, Zsasz, put a target on a young girl named Cass, the city is " + "</p>" +
                    "<p align = center> turned upside down looking for her. Harley, Huntress, Black Canary  " + "</p>" +
                    "<p align = center> and Renee Montoya's paths collide, and the unlikely foursome have  " + "</p>"  +
                    "<p align = center> no choice but to team up to take Roman down. <p>" +
                    "</html>";
            opisanie = new JLabel(s);
            opisanie.setBounds(170,-120,600,600);
            opisanie.setFont(font);
            opisanie.setForeground(Color.white);
            add(opisanie);






        } catch (IOException ex) {
            ex.printStackTrace();
        }


        setSize(900,600);
        setLayout(null);

        Integer []ages=new Integer[6];
        for (int i = 0; i <6 ; i++) {
            ages[i]=i;
        }



        chisla=new JComboBox(ages);
        chisla.setBounds(400,300,100,30);
        add(chisla);

        chisla1=new JComboBox(ages);
        chisla1.setBounds(400,350,100,30);
        add(chisla1);

        chisla2=new JComboBox(ages);
        chisla2.setBounds(400,400,100,30);
        add(chisla2);



        food=new JCheckBox("food");
        food.setBounds(400,450,100,30);
        add(food);

        buttonBack = new JButton("BACK");
        buttonBack.setBounds(20, 510, 80, 30);
        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.selectMovieWindow.setVisible(true);

                Main.frame.m5.setVisible(false);
            }
        });
        add(buttonBack);

        buttonNext = new JButton("NEXT");
        buttonNext.setBounds(780, 510, 80, 30);
        buttonNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index;
                index=(Integer)(food.isSelected()?1:0);
                String movieName="Камуфляж и шпионаж";
                int countStudent,countChild,countAdult;
                countStudent=(Integer)chisla1.getSelectedItem();
                countAdult=(Integer)chisla2.getSelectedItem();
                countChild=(Integer)chisla.getSelectedItem();
                String fullInfo;
                fullInfo="Хищные птицы-"+countChild+"-"+countStudent+"-"+countAdult+"-"+index+"-";

                try {
                    FileWriter writer = new FileWriter("data.txt");
                    writer.write(fullInfo);
                    writer.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }


                if (index==1){
                    Main.frame.m5.setVisible(false);
                    Main.frame.food.setVisible(true);

                }
                if (index==0){
                    Main.frame.m5.setVisible(false);
                    Main.frame.bill.setVisible(true);
                }

                //Main.frame.selectMovieWindow.setVisible(false);

            }
        });
        add(buttonNext);



        JLabel fone = new JLabel();
        ImageIcon icon = createIcon("/com/posters/foneM5.jpg");
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
