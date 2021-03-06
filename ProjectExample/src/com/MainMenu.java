package com;

import com.Class.RegistrationUsers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;

public class MainMenu extends Container{
    private JLabel label1;
    private JButton regButton, loginButton, exitButton, adminButton;
    private ImageIcon imageIcon;

    public MainMenu() {
        setSize(900, 600);
        setLayout(null);

        JButton loginButton = new JButton();
        ImageIcon imageIcon = createIcon("/images/loginButton.png");
        loginButton.setBounds(340,145,211,58);
        loginButton.setIcon(imageIcon);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.addWindow.setVisible(false);
                Main.frame.loginWindow.setVisible(true);
            }
        });
        add(loginButton);

        JButton regButton = new JButton();
        ImageIcon icon3 = createIcon("/images/regButton.png");
        regButton.setBounds(340,225,211,58);
        regButton.setIcon(icon3);
        regButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.addWindow.setVisible(true);
                Main.frame.loginWindow.setVisible(false);
            }
        });
        add(regButton);

        JButton exitButton = new JButton();
        ImageIcon icon1= createIcon("/images/exitButton.png");
        exitButton.setBounds(340,385,211,58);
        exitButton.setIcon(icon1);
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        add(exitButton);

        adminButton = new JButton();
        ImageIcon icon4= createIcon("/images/adminButton.png");
        adminButton.setBounds(340,305,211,58);
        adminButton.setIcon(icon4);
        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.adminpage.setVisible(false);
                Main.frame.admin.setVisible(true);
            }
        });
        add(adminButton);

        JLabel label1 = new JLabel();
        ImageIcon icon = createIcon("/images/fono12.png");
        label1.setBounds(0,0,900,600);
        label1.setIcon(icon);
        add(label1);

    }

    protected static ImageIcon createIcon (String path){
        URL imgURL = MainMenu.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("File not found " + path);
            return null;
        }
    }
}
