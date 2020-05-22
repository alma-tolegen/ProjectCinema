package com;

import com.Class.RegistrationUsers;

import javax.swing.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;


public class Main {
    public static MainFrame frame;
    private static Socket socket;
    private static ObjectOutputStream oos;
    private static ObjectInputStream ois;

    public static void main(String[] args) {
        connectServer();
        frame = new MainFrame();
        frame.setVisible(true);

    }

    public static void connectServer(){
        try {
            socket=new Socket("localhost",8008);
            oos=new ObjectOutputStream(socket.getOutputStream());
            ois=new ObjectInputStream(socket.getInputStream());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addUser(PackageData pd) {
        try{
            oos.writeObject(pd);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void login(PackageData pd) {
        try {
            oos.writeObject(pd);
            pd = (PackageData) ois.readObject();
            if (pd.getCode().equals("user")) {
                frame.loginWindow.error(pd.getCode());
            }
            else {
                frame.loginWindow.error("NoConnect");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}