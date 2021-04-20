package com.imooc.test;

public interface IFather {
    void say();
    //使用default method 那么新加的方法就不会影响原先实现这个接口的类的使用
    default void connection(){
        System.out.println("IFather2中的connection");
    }
}
