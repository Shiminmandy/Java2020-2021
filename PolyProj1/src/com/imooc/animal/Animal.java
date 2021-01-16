package com.imooc.animal;

//抽象类 abstract：不允许实例化，可以通过向上转型，指向子类实例
public abstract class Animal {
    //属性： 姓名，年龄
    private String name;
    private int month;

    //无参构造
    public Animal(){

    }

    //带参构造完成属性赋值
    public Animal(String name,int month){
        this.name=name;
        this.month=month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    //方法：吃东西
    //抽象方法：不允许包含方法体；子类中需要重写父类中的抽象方法，否则子类也是抽象类
    //static private final 不能与abstract并存
    public abstract void eat();
}
