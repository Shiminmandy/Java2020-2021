package com.imooc.test;

import com.imooc.animal.Animal;
import com.imooc.animal.Cat;
import com.imooc.animal.Dog;
import com.imooc.animal.Master;

public class MasterTest {
    public static void main(String[] args){
        Master master=new Master();
        Cat one=new Cat();
        Dog two=new Dog();
        master.feed(one);
        master.feed(two);
        System.out.println("====================");
        boolean isManyTime=true;
        Animal temp=master.raise(isManyTime);
//        if(isManyTime){
//            temp=master.hasMainTime();
//        }else{
//           temp= master.hasLittleTime();
//        }
          System.out.println(temp);
    }
}
