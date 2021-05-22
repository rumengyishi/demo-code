package com.demo.design.factory;

public class MailFactory implements Provider{
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
