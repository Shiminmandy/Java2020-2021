package com.imooc.test;

import java.util.Scanner;

public class TryDemoFour {
    public static void main(String[] args){
        try {
            testAge();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*throw 抛出异常对象的处理方案：
     *1.通过try..catch包含throw语句--自己抛出自己处理
     * 2.通过throws在方法声明处抛出异常类型--谁调用谁处理--调用者可以自己处理，也可以继续上抛
     *      此时可以抛出与throw对象相同的类型或者父类
     */

    /*
    //描述酒店的入住规则：限定年龄，18岁以下，80岁以上的住客必须由亲友陪同
    public static void testAge() {
        try {
            System.out.println("请输入年龄：");
            Scanner input = new Scanner(System.in);
            int age = input.nextInt();
            if (age < 18 || age > 80) {
                throw new Exception("18岁以下，80岁以上的住客必须由亲友陪同~");
            } else {
                System.out.println("欢迎入住本酒店~");
                }
            }catch(Exception e){
                e.printStackTrace();
        }
    }


     */

    public static void testAge() throws Exception {
        System.out.println("请输入年龄：");
        Scanner input=new Scanner(System.in);
        int age=input.nextInt();
        if(age<18 || age>80){
            throw new Exception("18岁以下，80岁以上的住客必须由亲友陪同~");
        }else{
            System.out.println("欢迎入住本酒店");
        }
    }


}
