package com.demo.design.adapter;

/**
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题。看图：
 */
public class ObjectWrapperTest {
    public static void main(String[] args) {
        Source source = new Source();
        TargetAble targetAble = new Wrappper(source);
        targetAble.method1();
        targetAble.method2();
    }
}
