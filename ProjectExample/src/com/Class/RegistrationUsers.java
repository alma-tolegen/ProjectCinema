package com.Class;

import java.io.Serializable;

public class RegistrationUsers implements Serializable{
    private Integer id;
    private String name;
    private String surname;
    private String login;
    private String password1;
    private String password2;


    public RegistrationUsers() {
    }

    public RegistrationUsers(Integer id, String name, String surname, String login, String password1, String password2) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password1 = password1;
        this.password2 = password2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String toString() {
        return  id +" " + name + " " + surname + " " + login + " " + password1 + " " + password2;
    }
}
