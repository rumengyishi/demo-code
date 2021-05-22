package com.demo.design.factory;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("mail sender !");
    }
}
