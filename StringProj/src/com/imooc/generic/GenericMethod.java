package com.imooc.generic;

public class GenericMethod {
    //字定义泛型方法
    public<T> void printValue(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        GenericMethod gm=new GenericMethod();
        gm.printValue("mandy");
        gm.printValue(500);
        gm.printValue(-100f);
    }
}
