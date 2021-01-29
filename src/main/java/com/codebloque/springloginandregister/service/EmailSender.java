package com.codebloque.springloginandregister.service;

public interface EmailSender {
    void send(String to, String email);
}