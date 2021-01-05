package com.imooc.test;

import com.imooc.animal.Animal;

public class TestInherit3 {
    public static void main(String[] args){
        Animal one=new Animal("花花",2);
        Animal two=new Animal("花花",2);
        //equals测试：继承object中的equals方法时，比较的是两个引用是否指向同一个对象
        Boolean flag=one.equals(two);
        System.out.println("one和two的引用比较："+flag);
        System.out.println("one和two的引用比较："+(one==two));
        System.out.println("==================================");
        String str1=new String("hello");
        String str2=new String("hello");
        flag=str1.equals(str2);
        System.out.println("str1和str2的引用比较："+flag);
        System.out.println("str1和str2的引用比较："+(str1==str2));
    }
}
