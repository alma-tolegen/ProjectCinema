package com.GUI;
import com.Class.Client;
import com.Class.ClientAndFood;
import com.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.URL;
import javax.swing.ImageIcon;

public class Bill extends Container{

    private JButton buttonNext;
    private JButton buttonBack;
    private JButton giveBill;
    //private JTextField screenText;
    private JTextArea jTextArea;

    public Bill(){

        setSize(900,600);
        setLayout(null);

        jTextArea=new JTextArea();
        jTextArea.setBounds(310,50,300,300);
        add(jTextArea);

        giveBill= new JButton("Give Bill");
        giveBill.setBounds(410, 385, 120, 30);
        giveBill.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BufferedReader read=null;
                try {
                    String text;
                    read=new BufferedReader(new FileReader("data.txt"));
                    text=read.readLine();
                    String[] subStr;
                    String delimeter = "-"; // Разделитель
                    subStr = text.split(delimeter); // Разделения строки str с помощью метода split()
                    // Вывод результата на экран
                    int index;
                    index=Integer.parseInt(subStr[4].trim());
                    if(index==0){
                        Client client=new Client();
                        client.setName(subStr[0]);
                        int countOfChild = Integer.parseInt(subStr[1].trim());
                        client.setCountOfChild(countOfChild);
                        int countOfStudent=Integer.parseInt(subStr[2].trim());
                        client.setCountOfStudent(countOfStudent);
                        int countOfAdult=Integer.parseInt(subStr[3].trim());
                        client.setCountOfAdult(countOfAdult);
                        jTextArea.append(client.toString());

                    }

                    if (index==1){
                        ClientAndFood clientAndFood=new ClientAndFood();
                        clientAndFood.setName(subStr[0]);
                        int countOfChild = Integer.parseInt(subStr[1].trim());
                        clientAndFood.setCountOfChild(countOfChild);
                        int countOfStudent=Integer.parseInt(subStr[2].trim());
                        clientAndFood.setCountOfStudent(countOfStudent);
                        int countOfAdult=Integer.parseInt(subStr[3].trim());
                        clientAndFood.setCountOfAdult(countOfAdult);
                        int CountOfCola=Integer.parseInt(subStr[5].trim());
                        clientAndFood.setCountOfCola(countOfAdult);
                        int countOfPopcorn=Integer.parseInt(subStr[6].trim());
                        clientAndFood.setCountOfPopcorn(countOfPopcorn);
                        jTextArea.append(clientAndFood.toString());
                    }

                } catch (IOException ex) {
                    ex.printStackTrace();
                }

            }
        });
        add(giveBill);

        buttonNext = new JButton("Main");
        buttonNext.setBounds(780, 510, 80, 30);
        buttonNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BufferedReader read=null;

                try {
                    String text;
                    read=new BufferedReader(new FileReader("data.txt"));
                    text=read.readLine();
                    System.out.println(text);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                Main.frame.menuWindow.setVisible(true);
                Main.frame.bill.setVisible(false);
            }
        });
        add(buttonNext);

        buttonBack = new JButton("BACK");
        buttonBack.setBounds(20, 510, 80, 30);
        buttonBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.selectMovieWindow.setVisible(true);
                Main.frame.bill.setVisible(false);

            }
        });
        add(buttonBack);

        JLabel fone = new JLabel();
        ImageIcon icon = createIcon("/com/posters/bill.jpg");
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
