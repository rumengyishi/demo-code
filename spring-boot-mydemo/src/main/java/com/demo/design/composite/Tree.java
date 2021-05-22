package com.demo.design.composite;

public class Tree {
    public TreeNode root = null;

    public Tree(String name) {
        this.root = new TreeNode(name);
    }


}
