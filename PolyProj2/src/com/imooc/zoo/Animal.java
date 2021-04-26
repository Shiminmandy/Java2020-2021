package com.imooc.zoo;

public abstract class Animal{
    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if(age<0){
            this.age=0;
        }
        else{
            this.age = age;
        }
    }

    public abstract void love();
}
