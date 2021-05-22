package com.demo.design.factory;

public class SmsSender implements Sender{

    @Override
    public void send() {
        System.out.println("sms sender !");
    }
}
