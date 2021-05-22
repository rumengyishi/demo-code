package com.demo.design.factory;

public class SmsFactory implements Provider{
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
