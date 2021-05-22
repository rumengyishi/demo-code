package com.demo.design.interpreter;

/**
 * 第四种：通过中间类
 * 解释器模式是我们暂时的最后一讲，一般主要应用在OOP开发中的编译器的开发中，所以适用面比较窄。
 *
 * Context类是一个上下文环境类，Plus和Minus分别是用来计算的实现，代码如下：
 */
public class InterpreterTest {
    public static void main(String[] args) {
        int result = new Minus().interpreter(new Context(new Plus().interpreter(new Context(9, 2)), 8));
        System.out.println(result);
    }
}
