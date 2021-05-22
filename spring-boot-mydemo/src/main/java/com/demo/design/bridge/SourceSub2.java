package com.demo.design.bridge;

public class SourceSub2 implements SourceAble{
    @Override
    public void method() {
        System.out.println("this is second source impl!");
    }
}
