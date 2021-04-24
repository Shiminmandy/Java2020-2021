package com.imooc.zoo;

public class Lion extends Animal implements IAct{
    public String color;
    public String sex;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void love() {
        System.out.println("爱好：喜欢吃各种肉类~");
    }

    @Override
    public void skill() {
        System.out.println("技能：擅长钻火圈");
    }

    @Override
    public void act() {

    }
}
