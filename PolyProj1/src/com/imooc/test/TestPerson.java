package com.imooc.test;

import com.imooc.people.Person;

public class TestPerson {
    public static void main(String[] args) {
        Person lily = new Person();
        //lily.age = 12;
        lily.age1=10;
/*
        //获取内部类对象实例，方式1：new 外部类. new 内部类
        Person.Heart myHeart=new Person().new Heart();
        System.out.println(myHeart.beat());
        //获取内部类对象实例，方式2:外部类对象.new 内部类
        myHeart=lily.new Heart();
        System.out.println(myHeart.beat());
        //获取内部类对象实例，方式3:外部类对象.获取方法
        myHeart=lily.getHeart();
        System.out.println(myHeart.beat());
    }
}

 */
/*
        //获取静态内部类对象实例
        Person.Heart myHeart = new Person.Heart();
        System.out.println(myHeart.beat());
        Person.Heart.say();//静态内部类的静态成员可以直接访问
        System.out.println(Person.Heart.age);//如上

 */
        System.out.println(lily.getHeart());
    }
}