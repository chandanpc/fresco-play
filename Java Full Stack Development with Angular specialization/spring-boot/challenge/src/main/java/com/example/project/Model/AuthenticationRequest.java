package com.example.project.Model;


import java.io.Serializable;

public class AuthenticationRequest implements Serializable {
    private static final long serialVersionUID =592646858300515070L;
    private String user_name;
    private String password;

    public AuthenticationRequest(String user_name, String password) {
        this.user_name = user_name;
        this.password = password;
    }

    public AuthenticationRequest() {
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUsername(String user_name) {

        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}