package com;

import java.sql.*;

public abstract class DBManager {
    public static Connection connection = null;
    public static Statement statement = null;
    public static ResultSet resultSet = null;
    public static String url = "jdbc:mysql://localhost/input?serverTimezone=Europe/Moscow&useSSL=false";
    public static String user = "root";
    public static String pass = "";

    public static Connection connection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager
                    .getConnection(url,user,pass);
            System.out.println("Connection success");
            return connection;
        }
            catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}


























//    private static Connection connect = null;
//    private static Statement statement = null;
//    private static ResultSet resultSet = null;
//    private static String url = "jdbc:mysql://localhost/authorize?serverTimezone=Europe/Moscow&useSSL=false";
//    private static String user = "root";
//    private static String pass = "";
//
//
//    public static Connection ConnectDb(){
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connect = DriverManager
//                    .getConnection(url,user,pass);
//            System.out.println("Connection success");
//            return connect;
//        }
//            catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//
//    public void registration() {
//
//    }
