package com.Class;

import com.inter;

public class ClientAndFood implements inter {
    private String name;
    private int countOfChild;
    private int countOfStudent;
    private int countOfAdult;
    private int CountOfCola;
    private int countOfPopcorn;

    public ClientAndFood() {
    }

    public ClientAndFood(String name, int countOfChild, int countOfStudent, int countOfAdult, int countOfCola, int countOfPopcorn) {
        this.name = name;
        this.countOfChild = countOfChild;
        this.countOfStudent = countOfStudent;
        this.countOfAdult = countOfAdult;
        CountOfCola = countOfCola;
        this.countOfPopcorn = countOfPopcorn;
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

    public int getCountOfCola() {
        return CountOfCola;
    }

    public void setCountOfCola(int countOfCola) {
        CountOfCola = countOfCola;
    }

    public int getCountOfPopcorn() {
        return countOfPopcorn;
    }

    public void setCountOfPopcorn(int countOfPopcorn) {
        this.countOfPopcorn = countOfPopcorn;
    }


    @Override
    public int getCost() {
        int sum;
        sum=sum = countOfChild*800+countOfStudent*1000+countOfAdult*1200+CountOfCola*200+countOfPopcorn*1200;
        return sum;
    }

    @Override
    public String toString() {
        return "Movie name: " + name +"\n" +
                "Children tickets: " + countOfChild +"\n" +
                "Student tickets: " + countOfStudent +"\n" +
                "Adult tickets: " + countOfAdult +"\n" +
                "Cola: " + CountOfCola + " pieces"+"\n" +
                "Popcorn: " + countOfPopcorn + " pieces"+"\n" +
                "Cost: "+getCost()+" KZT" +"\n" +"\n";
    }
}
