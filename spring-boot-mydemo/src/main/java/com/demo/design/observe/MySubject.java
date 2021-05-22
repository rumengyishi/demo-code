package com.demo.design.observe;

public class MySubject extends AbstractSubject{

    @Override
    public void operation() {
        System.out.println("mysubject update self");
        notifyObserve();
    }
}
