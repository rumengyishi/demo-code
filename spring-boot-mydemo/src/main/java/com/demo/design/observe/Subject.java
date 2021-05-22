package com.demo.design.observe;

public interface Subject {
    /**
     * /增加观察者/
     * @param observe
     */
    void add(Observe observe);

    /**
     * 删除观察者
     * @param observe
     */
    void remove(Observe observe);

    /**
     * 通知所有的观察者
     */
    void notifyObserve();

    /**
     * 自己的一些操作
     */
    void operation();
}
