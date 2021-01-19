package com.imooc.tel;
//接口访问修饰符：public 默认
public interface INet {
    /*接口中可以不写abstract关键字,
     *访问修饰符默认public
     * 当类实现接口时，需要去实现接口中的所有抽象方法，否则需要将该类设置为抽象类
     */
    public void network();
    void connection();

    //接口中可以包含常量，默认public static final
    int TEMP=20;
}
