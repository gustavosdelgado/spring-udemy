package com.example.springaop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount() {
        System.out.println("AccountDAO DOING SOME SHIT");
    }
    
}
