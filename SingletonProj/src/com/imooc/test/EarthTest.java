package com.imooc.test;

import com.imooc.singleton.Earth;

public class EarthTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("第一个地球创建中。。。。");
        Earth one= Earth.getInstance();

        System.out.println("第二个地球创建中。。。。");
        Earth two=Earth.getInstance();
        System.out.println("第三个地球创建中。。。。");
        Earth three=Earth.getInstance();
        System.out.println("问：三个地球是同一个么？");
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
    /**
     * 第一个地球创建中。。。。
     * 地球诞生
     * 第二个地球创建中。。。。
     * 第三个地球创建中。。。。
     * 问：三个地球是同一个么？
     * com.imooc.singleton.Earth@6acbcfc0
     * com.imooc.singleton.Earth@6acbcfc0
     * com.imooc.singleton.Earth@6acbcfc0
     */
    //单例模式只能创建一个对象，所以只调用了一次构造方法
}
