package com.imooc.test;

import com.imooc.tel.*;

public class PhoneTest {
    public static void main(String[] args){
        FourthPhone phone=new FourthPhone();
        phone.game();
        phone.netWork();
        phone.photo();
        phone.call();
        phone.message();
        phone.music();
        System.out.println("=====================");
        IPhoto ip=new FourthPhone();
        ip.photo();
        ip=new Camera();
        ip.photo();
        System.out.println("=======================");
        System.out.println(INet.TEMP);
        INet net=new SmartWatch();
        System.out.println(net.TEMP);//20?30?
        net.connection();
        INet.stop();
        SmartWatch sw=new SmartWatch();
        System.out.println(sw.TEMP);
        net.connection();
        INet.stop();
        System.out.println("=========================");
        INet net2=new SmartWatch();
        net2.connection();
        IPhoto ip2=new SmartWatch();
        ip2.connection();





    }
}
