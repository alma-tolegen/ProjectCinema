package com;

import com.Class.RegistrationUsers;

import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {
    private String code;
    //private Serializable data;
    RegistrationUsers registrationUsers;
    ArrayList<RegistrationUsers> Users;

    public PackageData() {
    }

    public PackageData(String code, RegistrationUsers registrationUsers) {
        this.code = code;
        this.registrationUsers = registrationUsers;
    }

    public PackageData(ArrayList<RegistrationUsers> users) {
        Users = users;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public RegistrationUsers getRegistrationUsers() {
        return registrationUsers;
    }

    public void setRegistrationUsers(RegistrationUsers registrationUsers) {
        this.registrationUsers = registrationUsers;
    }

    public ArrayList<RegistrationUsers> getUsers() {
        return Users;
    }

    public void setUsers(ArrayList<RegistrationUsers> users) {
        Users = users;
    }

    @Override
    public String toString() {
        return "PackageData{" +
                "code='" + code + '\'' +
                ", registrationUsers=" + registrationUsers +
                ", Users=" + Users +
                '}';
    }
}
