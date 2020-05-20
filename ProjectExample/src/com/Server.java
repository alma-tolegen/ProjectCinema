package com;

import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Server {
    private static Connection connection;

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket=new ServerSocket(8008);
            System.out.println("Waiting for a client...");
            while(true){
                Socket socket=serverSocket.accept();
                ServerThread ST = new ServerThread(socket);
                System.out.println("Client connected");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

