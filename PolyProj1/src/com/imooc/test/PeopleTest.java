package com.imooc.test;

//import com.imooc.anonymous.Men;
import com.imooc.anonymous.Person;
//import com.imooc.anonymous.Women;

public class PeopleTest {
    //根据传入的不同的人的类型，调用对应的read方法
    //方案一：
//    public void getRead(Men men){
//        men.read();
//    }
//    public void getRead(Women women){
//        women.read();
//    }

    //方案二：
    public void getRead(Person person){
        person.read();
    }
    public static void main(String[] args){
        PeopleTest test=new PeopleTest();
//    Men one=new Men();
//    Women two=new Women();
//    test.getRead(one);
//    test.getRead(two);

        //方案3：匿名内部类
        /*
         * 1.匿名内部类没有类型名称、实例对象名称
         * 2.编译后的文件名： 外部类$数字.class
         * 无法使用 public, private, protected,abstract,static 修饰
         * 无法编写构造方法，可以添加构造代码块
         * 不能出现静态成员
         * 匿名内部可以实现接口也可以继承父类，但是不可兼得
         */
        test.getRead(new Person(){
            {
                //构造代码块
            }
            @Override
            public void read() {
                System.out.println("男生喜欢看起点");
            }
        });
        test.getRead(new Person(){
            @Override
            public void read() {
                System.out.println("女生喜欢看晋江");
            }
        });
    }
}
