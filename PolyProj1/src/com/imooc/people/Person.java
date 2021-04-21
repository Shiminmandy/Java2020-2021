package com.imooc.people;

//外部类
public class Person {
    public static int age1;
    public int age;
    //方法内部类
    /*
     *1. 定义在方法内部，作用范围也在方法内
     * 2.和方法内部成员使用规则一样，class 前面不可以添加 public,private,protected,static
     * 3.类中不能包含静态成员
     * 4.类中可以包含final,abstract 修饰的成员，但不推荐使用
     */
    public Object getHeart(){
         class Heart{
            public int age1=10;
            public int age=13;
            int temp=22;
            public void say(){
                System.out.println("hello");
            }
            public String beat(){
                new Person().eat();
                //return age+"心脏在跳动";
                //return new Person().age+"心脏在跳动";//调用外部类的age
                return Person.age1+"心脏在跳动";//访问同名外部类age1
            }
        }
        return new Heart().beat();
//        new Heart().temp=12;
//        return new Heart();

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
/*    public class Heart{
//        int age=13;
//        int temp=22;
//
//        public String beat(){
//            eat();
//            //return age+"心脏在跳动";
//            return Person.this.age+"心脏在跳动";
//        }
//    }
//}
/*

 */

    //静态内部类
    /*
     *1.静态内部类中，只能直接访问外部类的静态成员，如果需要调用非静态成员，可以通过对象实例
     * 2.静态内部类对象实例时，可以不依赖外部类对象
     * 3.可以通过 外部类.内部类.静态成员 的方式，访问内部类中的静态成员
     * 4.当内部类属性与外部类属性同名时，默认调用内部类中的成员；
     *  如果需要访问外部类中的静态属性，则可以通过 外部类.属性的方式；
     *  如果需要访问外部类中的非静态属性，则可以通过 new 外部类(). 属性 的方式
     */
    //testPerson在另一个包中，所以提高访问权限，static前面要加public
//    public static class Heart{
//        public static int age1=10;
//        public static int age=13;
//        int temp=22;
//        public static void say(){
//            System.out.println("hello");
//        }
//        public String beat(){
//            new Person().eat();
//            //return age+"心脏在跳动";
//            return new Person().age+"心脏在跳动";//调用外部类的age
//            //return Person.age1+"心脏在跳动";//访问同名外部类age1
//        }
//    }
}

