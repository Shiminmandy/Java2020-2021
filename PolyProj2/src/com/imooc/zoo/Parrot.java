package com.imooc.zoo;

public class Parrot extends Animal implements IAct{
    public String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void love() {
        System.out.println("喜欢吃坚果和松子");
    }

    @Override
    public void skill() {
        System.out.println("擅长模仿");
    }

    @Override
    public void act() {

    }
}
