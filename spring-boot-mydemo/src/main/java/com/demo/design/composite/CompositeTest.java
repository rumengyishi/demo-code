package com.demo.design.composite;

/**
 * 组合模式有时又叫部分-整体模式在处理类似树形结构的问题时比较方便，看看关系图：
 * 使用场景：将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。
 */
public class CompositeTest {
    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode b = new TreeNode("B");
        TreeNode c = new TreeNode("C");
        b.add(c);
        tree.root.add(b);
        System.out.println(tree.toString());
        System.out.println("composite treeNode finished!");

    }
}
