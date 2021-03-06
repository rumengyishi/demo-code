package com.demo.design.observe;

/**
 * 第二类：两个类之间。
 *
 * 这个模式在内的接下来的四个模式，都是类和类之间的关系，不涉及到继承，学的时候应该 记得归纳，记得本文最开始的那个图。
 * 观察者模式很好理解，类似于邮件订阅和RSS订阅，当我们浏览一些博客或wiki时，经常会看到RSS图标，
 * 就这的意思是，当你订阅了该文章，如果后续有更新，会及时通知你。其实，
 * 简单来讲就一句话：当一个对象变化时，其它依赖该对象的对象都会收到通知，并且随着变化！
 * 对象之间是一种一对多的关系。先来看看关系图：
 *
 * ：MySubject类就是我们的主对象，Observer1和Observer2是依赖于MySubject的对象，
 * 当MySubject变化时，Observer1和Observer2必然变化。AbstractSubject类中定义着需要监控的对象列表，
 * 可以对其进行修改：增加或删除被监控对象，且当MySubject变化时，负责通知在列表内存在的对象。我们看实现代码：
 */
public class ObserveTest {
    public static void main(String[] args) {
        AbstractSubject subject = new MySubject();
        subject.add(new Observe1());
        subject.add(new Observe2());

        subject.operation();
    }
}
