package com.demo.design.proxy;

public class Cat implements Animal {
    @Override
    public void method() {
        System.out.println("the origin method!");
    }
}
