package com.imooc.test;

import com.imooc.animal.*;

public class PolyTest {
    public static void main(String[] args){
        Animal one=new Animal();//1
        /*
        向上转型、隐式转型、自动转型
        父类引用指向子类实例,可以调用子类重写父类的方法以及父类派生的方法，不能调用子类独有的方法
        小类转型为大类
         */

        Animal two=new Cat();//2
        Animal three=new Dog();//3

        one.eat(); //动物都有吃东西的能力。
        two.eat(); //猫吃鱼~~
        two.setMonth(2);
        System.out.println(two.getMonth());
        three.eat(); //狗吃肉~~

        System.out.println("==================");
        /*向下转型，强制类型转换
         *子类引用指向父类对象，此处必须进行强转，可以调用子类特有方法
         * 必须满足转型条件才能进行强转
         * instanceof 运算符，返回true，false
         */

        if(two instanceof Cat){
            Cat temp=(Cat) two;
            temp.eat();
            temp.run();
            temp.getMonth();
            System.out.println("two可以转换为Cat类型");
        }

        //正常运行
        if(two instanceof Dog) {
            Dog temp2 = (Dog) two;
            temp2.eat();
            temp2.sleep();
            temp2.getSex();
            System.out.println("two可以转换为Dog类型");
        }
        //Exception in thread "main" java.lang.ClassCastException: class com.imooc.animal.
        // Cat cannot be cast to class com.imooc.animal.Dog (com.imooc.animal.Cat and com.imooc.animal.Dog
        // are in unnamed module of loader 'app')
        //	at com.imooc.test.PolyTest.main(PolyTest.java:35)

        if(two instanceof Animal){
            System.out.println("Animal");
        }

        if(two instanceof Object){
            System.out.println("Object");
        }
    }
}
