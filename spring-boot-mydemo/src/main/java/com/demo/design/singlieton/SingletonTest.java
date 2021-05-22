package com.demo.design.singlieton;

public class SingletonTest {
    private static SingletonTest singletonTest = null;

    private SingletonTest() {

    }
    private static synchronized void syncInit() {
        if (singletonTest == null) {
            singletonTest = new SingletonTest();
        }
    }
    public SingletonTest getSingletonTest() {
        if (singletonTest == null) {
            syncInit();
        }
        return singletonTest;
    }
}
