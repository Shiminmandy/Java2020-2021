package com.imooc.test;

import com.imooc.animal.Animal;

public class TestInherit3 {
    public static void main(String[] args){
        Animal one=new Animal("花花",2);
        Animal two=new Animal("花花",2);
        /*equals测试：
         * 1. 继承object中的equals方法时，比较的是两个引用是否指向同一个对象
         * 2.子类可以通过重写equals方法的形式，改变比较的内容
         */

        boolean flag=one.equals(two);
        System.out.println("one和two的引用比较："+flag);
        System.out.println("one和two的引用比较："+(one==two));
        System.out.println("==================================");
        String str1=new String("hello");
        String str2=new String("hello");
        flag= str1.equals(str2);
        System.out.println("str1和str2的引用比较："+flag);
        System.out.println("str1和str2的引用比较："+(str1==str2));
        System.out.println("==================================");
        /*toString测试：
         * 1. 输出对象名时，会默认直接调用类中的toString
         * 2.继承Object中的toString方法时，输出对象的字符串表现形式：类型信息+@+地址信息
         * 3.子类可以通过重写toString的形式，改变输出的内容以及表现形式
         */
        System.out.println(one.toString());
        System.out.println(one);
    }
}
