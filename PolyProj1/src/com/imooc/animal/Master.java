package com.imooc.animal;

public class Master {
    /**喂宠物
     * 喂猫咪：吃完东西后，主人会带着猫咪去玩线球
     *喂狗狗：吃完东西后，主人会带着狗狗去睡觉
     * 养兔子、养狐狸、养乌龟
     */

    //方案一：编写方法，传入不同类型的动物，调用各自的方法
//    public void feed(Cat cat){
//        cat.eat();
//        cat.PlayBall();
//    }
//
//    public void feed(Dog dog){
//        dog.eat();
//        dog.sleep();
//    }

    //方案二：编写方法传入动物的父类，方法中通过类型转换，调用指定子类的方法
    public void feed(Animal obj){
        if(obj instanceof Cat){
            Cat temp=(Cat)obj;
            temp.eat();
            temp.PlayBall();
        }else if(obj instanceof Dog){
            Dog temp=(Dog)obj;
            temp.eat();
            temp.sleep();
        }
    }

}
