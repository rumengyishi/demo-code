package com.demo.design.interpreter;

public class Minus implements Expression{
    @Override
    public int interpreter(Context context) {
        return context.getNum1() - context.getNum2();
    }
}
