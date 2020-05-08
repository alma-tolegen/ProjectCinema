package com;

import com.GUI.*;
import com.movieGUI.*;

import javax.swing.*;

public class MainFrame extends JFrame {
    public static MainMenu menuWindow;
    public static RegistrationGUI addWindow;
    public static LoginGUI loginWindow;
    public static SelectMovieGUI selectMovieWindow;
    public static M1 m1;
    public static M2 m2;
    public static M3 m3;
    public static M4 m4;
    public static M5 m5;
    public static M6 m6;
    public static M7 m7;
    public static M8 m8;
    public static Food food;
    public static Bill bill;


    public MainFrame(){
        setSize(900, 600);
        setLocation(300,100);
        setTitle("Cinema Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        menuWindow = new MainMenu();
        add(menuWindow);

        addWindow = new RegistrationGUI();
        addWindow.setVisible(false);
        add(addWindow);

        loginWindow = new LoginGUI();
        loginWindow.setVisible(false);
        add(loginWindow);

        selectMovieWindow=new SelectMovieGUI();
        selectMovieWindow.setVisible(false);
        add(selectMovieWindow);

        m1=new M1();
        m1.setLocation(0,0);
        m1.setVisible(false);
        add(m1);

        m2=new M2();
        m2.setLocation(0,0);
        m2.setVisible(false);
        add(m2);

        m3=new M3();
        m3.setLocation(0,0);
        m3.setVisible(false);
        add(m3);

        m4=new M4();
        m4.setLocation(0,0);
        m4.setVisible(false);
        add(m4);

        m5=new M5();
        m5.setLocation(0,0);
        m5.setVisible(false);
        add(m5);

        m6=new M6();
        m6.setLocation(0,0);
        m6.setVisible(false);
        add(m6);

        m7=new M7();
        m7.setLocation(0,0);
        m7.setVisible(false);
        add(m7);

        m8=new M8();
        m8.setLocation(0,0);
        m8.setVisible(false);
        add(m8);

        food=new Food();
        food.setLocation(0,0);
        food.setVisible(false);
        add(food);

        bill=new Bill();
        bill.setLocation(0,0);
        bill.setVisible(false);
        add(bill);
    }
}
