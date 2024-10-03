package com.example.accounting_website;


import org.springframework.stereotype.Component;

@Component
public class welcome {

    public String getwelcomemessage() {
        return "Welcome to Spring Boot Application";
    }
}