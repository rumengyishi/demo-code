package com.demo.design.template;

public abstract class AbstractCalculator {

    public final int calculator(String exp, String opt) {
        int[] array = split(exp, opt);
        return calculator(array[0], array[1]);
    }

    public int[] split(String exp, String opt) {
        String[] split = exp.split(opt);
        int[] array = new int[2];
        array[0] = Integer.parseInt(split[0].trim());
        array[1] = Integer.parseInt(split[1].trim());
        return array;
    }

    public abstract int calculator(int num1, int num2);
}
