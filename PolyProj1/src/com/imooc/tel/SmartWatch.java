package com.imooc.tel;

public class SmartWatch implements INet{
    public static final int TEMP=30;
    public void call(){
        System.out.println("智能手表可以打电话");
    }
    public void message(){
        System.out.println("智能手表可以发短信");
    }
    public void network(){
        System.out.println("智能手表可以上网");
    }

    @Override
    public void connection() {
        
    }
}