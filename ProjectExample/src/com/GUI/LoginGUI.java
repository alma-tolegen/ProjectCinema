package com.GUI;

import com.Class.RegistrationUsers;
import com.Main;
import com.PackageData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;


public class LoginGUI extends Container{
    private JLabel label;
    private JLabel loginLabel;
    private JTextField login;
    private JTextField password1;
    private JPasswordField password1Label;
    private JLabel TitleLabel;
    private JButton nextButton;
    private JButton backButton;
    public Connection connection;
    public Statement statement;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;
    private ImageIcon imageIcon;




    public LoginGUI() {

        setSize(900,600);
        setLayout(null);

        Font font = new Font("Harrington", Font.BOLD, 22);

        JLabel loginLabel = new JLabel("Login");
        loginLabel.setBounds(550,303,200,30);
        //loginLabel.setForeground(Color.GRAY);
        loginLabel.setFont(font);
        add(loginLabel);

        JTextField login = new JTextField();
        login.setBounds(670,300,180,35);
        add(login);

        font = new Font("Harrington", Font.BOLD, 22);

        JLabel password1label = new JLabel("Password");
        password1label.setBounds(550,350,200,40);
        //nameLabel.setForeground(Color.RED);
        password1label.setFont(font);
        add(password1label);

        JPasswordField password1 = new JPasswordField();
        password1.setBounds(670,355,180,35);
        add(password1);
        password1.setEchoChar('*');

        font = new Font("Harrington", Font.BOLD, 35);

        JLabel TitleLabel = new JLabel("AUTHORIZATION");
        TitleLabel.setBounds(580,200,300,50);
        //nameLabel.setForeground(Color.GRAY);
        TitleLabel.setFont(font);
        add(TitleLabel);

        font = new Font("Harrington", Font.BOLD, 16);

        backButton = new JButton("BACK");
        backButton.setFont(font);
        add(backButton);
        backButton.setBounds(550, 520, 80, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(true);
                Main.frame.addWindow.setVisible(false);
                Main.frame.loginWindow.setVisible(false);
            }
        });

        font = new Font("Harrington", Font.BOLD, 16);

        nextButton = new JButton("COME IN");
        nextButton.setBounds(770, 520, 100, 30);
        nextButton.setFont(font);
        add(nextButton);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String login1 = login.getText();
                String password = password1.getText();
                PackageData pd = new PackageData();
                pd.setCode("login");
                RegistrationUsers ru = new RegistrationUsers();
                ru.setLogin(login1);
                ru.setPassword1(password);
                pd.setRegistrationUsers(ru);
                //System.out.println(pd);

                if(login1.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please, fill all fields!!!");
                }

                else{
                    //Main.frame.selectMovieWindow.setVisible(true);
                    //Main.frame.menuWindow.setVisible(false);
                    //Main.frame.loginWindow.setVisible(false);
                    Main.login(pd);
                }
            }
        });
        add(login);

        JLabel label = new JLabel();
        ImageIcon icon1 = createIcon("/images/login.png");
        label.setBounds(0,0,900,600);
        label.setIcon(icon1);
        add(label);
    }


    protected static ImageIcon createIcon (String path){
        URL imgURL = LoginGUI.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("File not found " + path);
            return null;
        }
    }

    public static void error(String code) {
        //System.out.println(code);
        if (code.equals("user")) {
            Main.frame.selectMovieWindow.setVisible(true);
            Main.frame.menuWindow.setVisible(false);
            Main.frame.loginWindow.setVisible(false);
        }
        else {
            JOptionPane.showMessageDialog(null, "Incorrect login or password");
        }
    }
}

