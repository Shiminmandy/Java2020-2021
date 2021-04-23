package com.imooc.anonymous;

import java.security.PrivateKey;

public abstract class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void read();
}
