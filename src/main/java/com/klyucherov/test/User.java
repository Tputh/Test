package com.klyucherov.test;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.*;
@Data
@RequiredArgsConstructor
public class User {
    private String login;
    private String email;

    public User(String login, String email) {
        checkEmail(email);
        this.login = login;
        this.email = email;
    }

    public boolean checkEmail(String email) {
        if (!email.contains("@") || !email.contains(".")){
            throw new RuntimeException("в ведены не коректные данные");
        }
        return true;
    }
}

