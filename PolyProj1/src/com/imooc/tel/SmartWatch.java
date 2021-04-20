package com.imooc.tel;
//一个类中可同时实现多个接口
public class SmartWatch implements INet,IPhoto{
    public static final int TEMP=30;
    public void call(){
        System.out.println("智能手表可以打电话。");
    }
    public void message(){
        System.out.println("智能手表可以发短信。");
    }
    public void network(){
        System.out.println("智能手表可以上网。");
    }

    @Override
    public void photo() {

    }

    @Override
    public void connection() {
        INet.super.connection();//调用接口中默认的方法
        System.out.println("SmartWatch中的connection");

    }
}
