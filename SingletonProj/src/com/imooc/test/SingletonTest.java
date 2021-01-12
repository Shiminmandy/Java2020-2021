package com.imooc.test;

import com.imooc.singleton.SingletonOne;
import com.imooc.singleton.SingletonTwo;

public class SingletonTest {
    public static void main(String[] args){
        SingletonOne one=SingletonOne.getInstance();
        SingletonOne two=SingletonOne.getInstance();
        System.out.println(one==two); //true
        System.out.println("======================");
        SingletonTwo three= SingletonTwo.getInstance();
        SingletonTwo four=SingletonTwo.getInstance();
        System.out.println(three==four);

    }
}
