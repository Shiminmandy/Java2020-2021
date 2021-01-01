package com.imooc.test;

import com.imooc.animal.Cat;
import com.imooc.animal.Dog;

public class TestInherit {
    public static void main(String[] args) {
        Cat one = new Cat();
        one.setName("花花");
        one.setSpecies("中华田园猫");
        one.run();
        one.eat();
        System.out.println(one.temp);//调用的是子类的temp
        System.out.println("===========================");
        Dog two = new Dog();
        two.setName("牛牛");
        two.setMonth(1);
        two.eat();
        two.sleep();
    }
}
