package com.GUI;

import com.Main;
import com.PackageData;
import com.Class.RegistrationUsers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.Connection;

public class RegistrationGUI extends Container {
    private JLabel label;
    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel loginLabel;
    private JLabel TitleLabel;

    private JTextField nameText;
    private JTextField surnameText;
    private JTextField loginText;

    private JPasswordField password1Pass;
    private JPasswordField password2Pass;

    private JButton nextButton;
    private JButton backButton;

    public Connection connection;

    public RegistrationGUI() {

        setSize(900,600);
        setLayout(null);

        Font font = new Font(null, Font.BOLD, 15);

        nameLabel = new JLabel("Name");
        nameLabel.setBounds(320,180,200,30);
        //nameLabel.setForeground(Color.RED);
        nameLabel.setFont(font);
        add(nameLabel);

        nameText = new JTextField();
        nameText.setBounds(400,180,200,30);
        nameText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.addWindow.setVisible(true);
            }
        });
        add(nameText);

        font = new Font(null, Font.BOLD, 15);

        surnameLabel = new JLabel("Surname");
        surnameLabel.setBounds(320,220,200,30);
        //nameLabel.setForeground(Color.GRAY);
        surnameLabel.setFont(font);
        add(surnameLabel);

        surnameText = new JTextField();
        surnameText.setBounds(400,220,200,30);
        surnameText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.addWindow.setVisible(true);
            }
        });
        add(surnameText);

        font = new Font(null, Font.BOLD, 15);

        loginLabel = new JLabel("Login");
        loginLabel.setBounds(320,260,200,30);
        //nameLabel.setForeground(Color.GRAY);
        loginLabel.setFont(font);
        add(loginLabel);

        loginText = new JTextField();
        loginText.setBounds(400,260,200,30);
        add(loginText);
        loginText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.addWindow.setVisible(true);
            }
        });


        font = new Font(null, Font.BOLD, 15);

        JLabel password1label = new JLabel("Password");
        password1label.setBounds(320,300,200,30);
        //nameLabel.setForeground(Color.GRAY);
        password1label.setFont(font);
        add(password1label);

        JPasswordField password1Pass = new JPasswordField();
        password1Pass.setBounds(400,300,200,30);
        password1Pass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.addWindow.setVisible(true);
            }
        });
        add(password1Pass);
        password1Pass.setEchoChar('*');

        font = new Font(null, Font.BOLD, 15);

        JLabel password2label = new JLabel("Password");
        password2label.setBounds(320,340,200,30);
        //nameLabel.setForeground(Color.GRAY);
        password2label.setFont(font);
        add(password2label);

        JPasswordField password2Pass = new JPasswordField();
        password2Pass.setBounds(400,340,200,30);
        password2Pass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(false);
                Main.frame.addWindow.setVisible(false);
            }
        });
        add(password2Pass);
        password2Pass.setEchoChar('*');

        font = new Font(null, Font.BOLD, 25);

        JLabel TitleLabel = new JLabel("REGISTRATION");
        TitleLabel.setBounds(350,130,200,30);
        //nameLabel.setForeground(Color.GRAY);
        TitleLabel.setFont(font);
        add(TitleLabel);

        nextButton = new JButton("Sign Up");
        nextButton.setBounds(780, 510, 80, 30);
        add(nextButton);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = nameText.getText();
                String surname = surnameText.getText();
                String login = loginText.getText();
                String password1 = password1Pass.getText();
                String password2 = password2Pass.getText();


                if(name.isEmpty() || surname.isEmpty() || login.isEmpty() || password1.isEmpty() || password2.isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please, fill all fields!!!");
                }

                else {
                    if (password1.equals(password2)) {
                        RegistrationUsers regUsers = new RegistrationUsers(null, name, surname, login, password1, password2);
                        PackageData pd = new PackageData("addUser", regUsers);
                        JOptionPane.showMessageDialog(null, "Registration was successful!!!");
                        System.out.println(pd.getRegistrationUsers());
                        try {
                            Main.addUser(pd);
                        } catch (Exception eq) {
                            eq.printStackTrace();
                        }

                        Main.frame.menuWindow.setVisible(false);
                        Main.frame.addWindow.setVisible(false);
                        Main.frame.selectMovieWindow.setVisible(true);
                    }

                    else {
                        JOptionPane.showMessageDialog(null, "Incorrect password!!!");
                    }
                }
            }
        });


        backButton = new JButton("BACK");
        backButton.setBounds(20, 510, 80, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.frame.menuWindow.setVisible(true);
                Main.frame.addWindow.setVisible(false);
            }
        });
        add(backButton);

        JLabel label = new JLabel();
        ImageIcon icon1 = createIcon("/images/12.jpg");
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
}
