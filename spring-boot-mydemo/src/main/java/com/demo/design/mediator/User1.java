package com.demo.design.mediator;

public class User1 extends User{
    public User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    void work() {
        System.out.println("user1 exec");
    }
}
