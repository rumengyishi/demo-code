package com.demo.design.strategy;

public abstract class AbstractCalculator {
    public int[] split(String exp, String opt) {
        String[] split = exp.split(opt);
        int[] array = new int[2];
        array[0] = Integer.parseInt(split[0].trim());
        array[1] = Integer.parseInt(split[1].trim());
        return array;
    }
}
