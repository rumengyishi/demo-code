package com.demo.design.visitor;

public interface Subject {
    void accept(Visitor visitor);

    String getSubject();
}
