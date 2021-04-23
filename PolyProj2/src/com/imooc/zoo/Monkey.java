package com.imooc.zoo;

public class Monkey extends Animal implements IAct{
    public String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void love() {
        System.out.println("喜欢模仿人的动作表情");
    }

    @Override
    public void skill() {
        System.out.println("骑车过独木桥");
    }

    @Override
    public void act() {

    }
}
