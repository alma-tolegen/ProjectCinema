package com;

import com.Class.RegistrationUsers;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.sql.*;
import java.util.ArrayList;


public class ServerThread extends Thread {
    private Socket socket;
    public static Connection connection = DBManager.connection();

    public ServerThread(Socket socket) {
        this.socket = socket;
        start();
    }

    public void run() {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());


            while (true) {
                PackageData packageData = (PackageData) inputStream.readObject();

                if (packageData.getCode().equals("addUser")) {
                    RegistrationUsers rU = packageData.getRegistrationUsers();
                    try {
                        System.out.println(rU.toString() + " " + rU.getName());
                        String query = "insert into regusers (name, surname, login, password1, password2) values (?, ?, ?, ?, ?)";
                        PreparedStatement statement = connection.prepareStatement(query);
                        statement.setString(1, rU.getName());
                        statement.setString(2, rU.getSurname());
                        statement.setString(3, rU.getLogin());
                        statement.setString(4, rU.getPassword1());
                        statement.setString(5, rU.getPassword2());

                        statement.execute();
                        statement.close();

                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                else if (packageData.getCode().equals("login")) {
                    RegistrationUsers rU = packageData.getRegistrationUsers();
                    try {
                        String query = "select * from regusers where login=? and password1=?";
                        PreparedStatement preparedStatement;
                        preparedStatement = connection.prepareStatement(query);
                        preparedStatement.setString(1, rU.getLogin());
                        preparedStatement.setString(2, rU.getPassword1());
                        ResultSet resultSet;
                        resultSet = preparedStatement.executeQuery();
                        if (resultSet.next()) {
                            packageData.setCode("user");
                            outputStream.writeObject(packageData);
                        }

                        else {
                            outputStream.writeObject(packageData);
                        }

                    }

                    catch (SQLException et) {
                        outputStream.writeObject(packageData);
                        et.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Client lost");
        }
    }
}


