package com.demo.design.bridge;

public class MyBridge extends Bridge{

    @Override
    public void method() {
        getSourceAble().method();
    }
}
