package com.demo.design.proxy;

public class Proxy implements Animal{
    private Cat cat;

    public Proxy() {
        this.cat = new Cat();
    }


    @Override
    public void method() {
        begin();
        cat.method();
        end();
    }

    public void begin() {
        System.out.println("the proxy begin");
    }

    public void end() {
        System.out.println("the proxy end");
    }
}
