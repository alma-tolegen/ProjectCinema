package com.Class;

import com.inter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Client implements inter {
    private String name;
    private int countOfChild;
    private int countOfStudent;
    private int countOfAdult;
    private int priceOfChild;
    private int priceOfStudent;
    private int priceOfAdult;

    public Client(String name, int countOfChild, int countOfStudent, int countOfAdult) {
        this.name = name;
        this.countOfChild = countOfChild;
        this.countOfStudent = countOfStudent;
        this.countOfAdult = countOfAdult;
    }

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountOfChild() {
        return countOfChild;
    }

    public void setCountOfChild(int countOfChild) {
        this.countOfChild = countOfChild;
    }

    public int getCountOfStudent() {
        return countOfStudent;
    }

    public void setCountOfStudent(int countOfStudent) {
        this.countOfStudent = countOfStudent;
    }

    public int getCountOfAdult() {
        return countOfAdult;
    }

    public void setCountOfAdult(int countOfAdult) {
        this.countOfAdult = countOfAdult;
    }

    @Override
    public int getCost() {
        BufferedReader read=null;
        try {
            String text;
            read=new BufferedReader(new FileReader("price.txt"));
            text=read.readLine();
            String[] subStr;
            String delimeter = "-";
            subStr = text.split(delimeter);
            int priceA=Integer.parseInt(subStr[0].trim());
            priceOfAdult=priceA;
            int priceS=Integer.parseInt(subStr[1].trim());
            priceOfStudent=priceS;
            int priceCH=Integer.parseInt(subStr[2].trim());
            priceOfChild=priceCH;


        } catch (IOException ex) {
            ex.printStackTrace();
        }
        int sum;
        sum = countOfChild*priceOfChild + countOfStudent*priceOfStudent + countOfAdult*priceOfAdult;
        return sum;
    }

    @Override
    public String toString() {
        return "Movie name: " + name +"\n" +
                "Children tickets: " + countOfChild +"\n" +
                "Student tickets: " + countOfStudent +"\n" +
                "Adult tickets: " + countOfAdult +"\n" +
                "Cost: "+ getCost()+" KZT" +"\n" +"\n";
    }
}
