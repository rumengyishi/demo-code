package com.demo.design.iterator;

public interface Collection {
    Iterator iterator();

    int size();

    Object get(int index);
}
