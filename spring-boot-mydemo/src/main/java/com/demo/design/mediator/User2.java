package com.demo.design.mediator;

public class User2 extends User{
    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    void work() {
        System.out.println("user2 exec");
    }
}
