package com.demo.design.bridge;

public abstract class Bridge {
    private SourceAble sourceAble;

    public void method() {
        this.sourceAble.method();
    }

    public SourceAble getSourceAble() {
        return sourceAble;
    }

    public void setSourceAble(SourceAble sourceAble) {
        this.sourceAble = sourceAble;
    }
}
