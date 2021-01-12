package com.imooc.test;

import com.imooc.car.*;

public class TestInherit4 {
    public static void main(String[] args){
        //实例化父类对象，并传入两组相同的属性值
        Car c1=new Car("蓝色的","张小泉");
        Car c2=new Car("蓝色的","张小泉");

        //调用父类use方法
        c1.use();

        //通过重写equals方法，比较两个对象是否相等

        boolean flag=c1.equals(c2);
        System.out.println("car1和car2的引用比较："+flag);

        System.out.println("==================================");
        //实例化子类Taxi对象，并传入属性值

        Taxi t1=new Taxi("长生公司","蓝色的","张小泉");
        //调用ride和use方法

        t1.ride();
        t1.use();
        //输出重写toString后的taxi信息
        System.out.println(t1);

        System.out.println("==================================");
        //实例化子类HomeCar对象，并传入属性值

        HomeCar h1=new HomeCar("紫色","孙二娘",7);
        //调用display方法及它的重载方法
        h1.display();
        h1.display(5);


    }

}
