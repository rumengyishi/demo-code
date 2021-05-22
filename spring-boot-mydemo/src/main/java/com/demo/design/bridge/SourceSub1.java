package com.demo.design.bridge;

public class SourceSub1 implements SourceAble{
    @Override
    public void method() {
        System.out.println("this is first source impl!");
    }
}
