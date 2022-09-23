package com.example.project.Model;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable {
    private String token;

    public AuthenticationResponse() {
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public AuthenticationResponse(String token) {
        this.token = token;
    }
}