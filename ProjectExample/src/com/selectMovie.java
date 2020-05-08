//package com;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.net.URL;
//import java.sql.*;
//import javax.swing.ImageIcon;
//
//public class selectMovie extends Container {
//    private JLabel fone;
//    private JButton button;
//    private JButton button1;
//    private JButton button2;
//    private JButton button3;
//    private JButton button4;
//    private JButton button5;
//    private JButton button6;
//    private JButton button7;
//    private JButton buttonBack;
//    private JButton buttonNext;
//
//
//
//    public selectMovie(){
//        setSize(900,600);
//        setLayout(null);
//        JLabel fone = new JLabel();
//        ImageIcon icon = createIcon("img/foneSelect.jpg");
//        fone.setBounds(0,0,900,600);
//        fone.setIcon(icon);
//        add(fone);
//
//
//        ImageIcon icon1 = createIcon("posters/movie1.jpg");
//        button =new JButton(icon1);
//        button.setBounds(79,35,148,220);
//        button.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Main.frame.selectMovieWindow.setVisible(false);
//                Main.frame.m1.setVisible(true);
//
//            }
//        });
//        add(button);
//
//        ImageIcon icon2 = createIcon("posters/movie2.jpg");
//        button1 =new JButton(icon2);
//        button1.setBounds(277,35,148,220);
//        button1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Main.frame.selectMovieWindow.setVisible(false);
//                Main.frame.m2.setVisible(true);
//
//            }
//        });
//        add(button1);
//
//        ImageIcon icon3 = createIcon("posters/movie3.jpg");
//        button2 =new JButton(icon3);
//        button2.setBounds(475,35,148,220);
//        button2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Main.frame.selectMovieWindow.setVisible(false);
//                Main.frame.m3.setVisible(true);
//
//            }
//        });
//        add(button2);
//
//        ImageIcon icon4 = createIcon("posters/M4.jpg");
//        button3 =new JButton(icon4);
//        button3.setBounds(673,35,148,220);
//        button3.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Main.frame.selectMovieWindow.setVisible(false);
//                Main.frame.m4.setVisible(true);
//
//            }
//        });
//        add(button3);
//
//        ImageIcon icon5 = createIcon("posters/M5.jpg");
//        button4 =new JButton(icon5);
//        button4.setBounds(79,270,148,220);
//        button4.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Main.frame.selectMovieWindow.setVisible(false);
//                Main.frame.m5.setVisible(true);
//
//            }
//        });
//        add(button4);
//
//        ImageIcon icon6 = createIcon("posters/M6.jpg");
//        button5 =new JButton(icon6);
//        button5.setBounds(277,270,148,220);
//        button5.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Main.frame.selectMovieWindow.setVisible(false);
//                Main.frame.m6.setVisible(true);
//
//            }
//        });
//        add(button5);
//
//        ImageIcon icon7 = createIcon("posters/M7.jpg");
//        button6 =new JButton(icon7);
//        button6.setBounds(475,270,148,220);
//        button6.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Main.frame.selectMovieWindow.setVisible(false);
//                Main.frame.m7.setVisible(true);
//
//            }
//        });
//        add(button6);
//
//        ImageIcon icon8 = createIcon("posters/M8.jpg");
//        button7 =new JButton(icon8);
//        button7.setBounds(673,270,148,220);
//        button7.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Main.frame.selectMovieWindow.setVisible(false);
//                Main.frame.m8.setVisible(true);
//
//            }
//        });
//        add(button7);
//
//        buttonNext = new JButton("NEXT");
//        buttonNext.setBounds(780, 510, 80, 30);
//        buttonNext.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Main.frame.selectMovieWindow.setVisible(false);
//
//            }
//        });
//        add(buttonNext);
//
//        buttonBack = new JButton("BACK");
//        buttonBack.setBounds(20, 510, 80, 30);
//        buttonBack.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Main.frame.selectMovieWindow.setVisible(false);
//
//                Main.frame.loginWindow.setVisible(true);
//            }
//        });
//        add(buttonBack);
//
//
//
//    }
//
//    protected static ImageIcon createIcon (String path){
//        URL imgURL = RegistrationGUI.class.getResource(path);
//        if (imgURL != null) {
//            return new ImageIcon(imgURL);
//        } else {
//            System.err.println("File not found " + path);
//            return null;
//        }
//    }
//}
