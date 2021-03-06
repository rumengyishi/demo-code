package com.demo.design.iterator;

/**
 * 顾名思义，迭代器模式就是顺序访问聚集中的对象，
 * 一般来说，集合中非常常见，如果对集合类比较熟悉的话，理解本模式会十分轻松。
 * 这句话包含两层意思：一是需要遍历的对象，即聚集对象，二是迭代器对象，用于对聚集对象进行遍历访问。我们看下关系图：
 *
 * 这个思路和我们常用的一模一样，MyCollection中定义了集合的一些操作，
 * MyIterator中定义了一系列迭代操作，且持有Collection实例，我们来看看实现代码：
 *
 * 此处我们貌似模拟了一个集合类的过程，感觉是不是很爽？其实JDK中各个类也都是这些基本的东西，
 * 加一些设计模式，再加一些优化放到一起的，只要我们把这些东西学会了，掌握好了，我们也可以写出自己的集合类，甚至框架！
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
