package com.demo.design.iterator;

public class MyCollection implements Collection{
    public String[] arrays = {"1", "3", "5", "6"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public int size() {
        return arrays.length;
    }

    @Override
    public Object get(int index) {
        return arrays[index];
    }
}
