package com.demo.design.decorator;

public class Decorator implements SourceAble{
    private SourceAble sourceAble;

    public Decorator(SourceAble sourceAble) {
        super();
        this.sourceAble = sourceAble;
    }
    @Override
    public void method() {
        System.out.println("the decorator begin !");
        sourceAble.method();
        System.out.println("the decorator end!");
    }
}
