package com.GUI;

import com.Class.RegistrationUsers;
import com.Main;
import com.PackageData;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class AdminPageGui extends Container {
    private JLabel label;
    private JLabel loginLabel;
    private JPasswordField password1;
    private ImageIcon imageIcon;
    private JButton nextButton;


    public AdminPageGui() {

        setSize(900, 600);
        setLayout(null);

        Font font = new Font("", Font.BOLD, 22);

        JLabel loginLabel = new JLabel("PINCODE");
        loginLabel.setBounds(460, 200, 200, 30);
        //loginLabel.setForeground(Color.GRAY);
        loginLabel.setFont(font);
        add(loginLabel);

        JPasswordField password1 = new JPasswordField();
        password1.setBounds(600, 200, 180, 35);
        add(password1);
        //password1.setEchoChar('*');

        font = new Font(null, Font.BOLD, 35);

        JLabel TitleLabel = new JLabel("ADMIN PAGE");
        TitleLabel.setBounds(510,100,300,30);
        //nameLabel.setForeground(Color.GRAY);
        TitleLabel.setFont(font);
        add(TitleLabel);

        nextButton = new JButton("LOGON");
        nextButton.setBounds(560, 320, 100, 30);
        add(nextButton);
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String password = password1.getText();

                if (password.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please, fill all fields!!!");
                }

                else if(password.equals("admin123")){
                    Main.frame.admin.setVisible(false);
                    Main.frame.menuWindow.setVisible(false);
                    Main.frame.adminpage.setVisible(true);
                }

                else{
                    JOptionPane.showMessageDialog(null, "Incorrect pincode");
                }
            }
        });

        JLabel label = new JLabel();
        ImageIcon icon1 = createIcon("/images/123.jpg");
        label.setBounds(0, 0, 900, 600);
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
