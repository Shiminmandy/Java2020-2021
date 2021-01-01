package com.imooc.animal;
//子类在前，父类在后
public class Cat extends Animal{
    private double weight;//体重

    //无参构造
    public Cat(){

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //跑动的方法
    public void run(){
        //子类只能访问父类的非私有成员
        System.out.println(this.getName()+"是一只"+this.getSpecies()+",它在快乐地奔跑");
    }
}
