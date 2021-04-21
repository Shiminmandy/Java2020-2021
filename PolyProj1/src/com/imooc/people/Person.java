package com.imooc.people;

//外部类
public class Person {
    int age;
    public Heart getHeart(){
        new Heart().temp=12;
        return new Heart();
    }

    public void eat(){
        System.out.println("人会吃东西");
    }
    //成员内部类
    /*
     *1.内部类在外部使用时，无法直接实例化，需要借由外部类信息才能完成实例化
     * 2.内部类的访问修饰符可以任意，但是访问范围会受到影响
     * 3.内部类可以直接访问外部类的成员；但如果出现同名属性，有限访问内部类中定义的
     * 4.可以使用  外部类.this.成员 的方式，访问外部类中同名的信息
     * 5.内部类编译后.class文件命名： 外部类$内部类.class
     */
    class Heart{
        int age=13;
        int temp=22;
//        public void eat(){
//            System.out.println("心跳");
//        };
        public String beat(){
            eat();
            //return age+"心脏在跳动";
            return Person.this.age+"心脏在跳动";
        }
    }
}
