package com.imooc.test;

public class HotelAgeException extends Exception{
    //无参构造方法，调用父类带参构造
    public HotelAgeException(){
        super("18岁以下，80岁以上的住客必须由亲友陪同~");
    }
}
