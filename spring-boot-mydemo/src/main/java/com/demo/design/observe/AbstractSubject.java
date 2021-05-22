package com.demo.design.observe;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject{

    private Vector<Observe> vector = new Vector<>();

    @Override
    public void add(Observe observe) {
        vector.add(observe);
    }

    @Override
    public void remove(Observe observe) {
        vector.remove(observe);
    }

    @Override
    public void notifyObserve() {
        Enumeration<Observe> elements = vector.elements();
        while (elements.hasMoreElements()) {
            elements.nextElement().update();
        }
    }
}
