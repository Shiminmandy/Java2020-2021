package com.imooc.animal;
//子类在前，父类在后
public class Cat extends Animal{
    private double weight;//体重
    //在子类中，可以定义与父类重名的属性
    public int temp=300;

    public static int st3=44;

    static{
        System.out.println("我是子类的静态代码块");
    }
    {
        System.out.println("我是子类的构造代码块");
    }

    //无参构造
    public Cat(){
        System.out.println("我是子类的无参构造方法");
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
        System.out.println(this.getName()+"是一只"+this.getSpecies()+",它在快乐地奔跑.");
    }
}
