package com.example.loginregistrationservice.model.email;

public interface EmailSender {
    void send(String to, String email);
}
