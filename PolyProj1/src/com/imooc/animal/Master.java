package com.imooc.animal;

public class Master {
    /**喂宠物
     * 喂猫咪：吃完东西后，主人会带着猫咪去玩线球
     *喂狗狗：吃完东西后，主人会带着狗狗去睡觉
     * 养兔子、养狐狸、养乌龟
     */
    public void feed(Cat cat){
        cat.eat();
        cat.PlayBall();
    }

    public void feed(Dog dog){
        dog.eat();
        dog.sleep();
    }


}
