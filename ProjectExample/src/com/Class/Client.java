package com.Class;

import com.inter;

public class Client implements inter {
    private String name;
    private int countOfChild;
    private int countOfStudent;
    private int countOfAdult;

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
        int sum;
        sum = countOfChild*800 + countOfStudent*1000 + countOfAdult*1200;
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
