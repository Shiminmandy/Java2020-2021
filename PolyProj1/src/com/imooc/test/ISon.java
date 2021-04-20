package com.imooc.test;

//接口也可以实现继承，并且可以继承多个父接口
public interface ISon extends IFather,IFather2{
    void run();
    //因为继承的两个父方法都有同名的方法，所以子类只好创建一个属于自己的同名方法
    default void connection(){
        System.out.println("ISon中的connection");
    }
}
