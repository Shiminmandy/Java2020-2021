package com.imooc.zoo;

public class Clown implements IAct{

    public int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void skill() {

    }

    @Override
    public void act() {
        System.out.println("脚踩高跷，进行杂技魔术表演");
    }
    public void dress(){
        System.out.println("身穿五彩服装，头上戴着五彩的帽子，脸上画着夸张的彩妆");
    }
}
