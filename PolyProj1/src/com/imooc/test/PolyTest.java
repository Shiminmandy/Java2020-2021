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
    }
}
