package com.imooc.test;

import com.imooc.animal.Cat;

public class TestInherit2 {
    public static void main(String[] args){
        Cat one=new Cat();
        System.out.println(one.temp);
        //我是父类的静态代码块
        //我是子类的静态代码块
        //我是父类的构造代码块
        //我是父类的无参构造方法
        //我是子类的构造代码块
        //我是子类的无参构造方法
        //300
    }
}
