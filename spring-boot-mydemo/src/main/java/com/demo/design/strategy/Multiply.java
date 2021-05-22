package com.demo.design.strategy;

public class Multiply extends AbstractCalculator implements ICalculator{
    @Override
    public int calculator(String exp) {
        int[] array = this.split(exp, "[*]");
        return array[0] * array[1];
    }
}
