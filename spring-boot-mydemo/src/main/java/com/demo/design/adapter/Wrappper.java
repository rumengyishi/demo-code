package com.demo.design.adapter;


public class Wrappper implements TargetAble {
    private Source source;

    public Wrappper(Source source) {
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is targetable method！");
    }
}
