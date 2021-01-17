package com.imooc.test;

import com.imooc.tel.FourthPhone;
import com.imooc.tel.IPhoto;
import com.imooc.tel.Camera;
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





    }
}
