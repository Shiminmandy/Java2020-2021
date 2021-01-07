package com.imooc.test;

import com.imooc.fruits .*;

public class FruitsTest {
    public static void main(String[] args) {
        // 实例化2个父类对象，传入两组相同的参数值

        Fruits f1=new Fruits("圆形","酸甜");
        Fruits f2=new Fruits("圆形","酸甜");
        // 调用父类eat方法
        f1.eat();

        // 测试重写equals方法，判断两个对象是否相等
        boolean flag=f1.equals(f2);
        System.out.println("f1和f2的引用比较："+flag);

        System.out.println("————————————————————————————————————————");
        // 实例化子类对象，并传入相关参数值
        Waxberry w1=new Waxberry("紫红色","圆形","酸甜适中");

        // 调用子类face方法和eat方法

        w1.face();
        w1.eat();

        // 测试重写toString方法，输出子类对象的信息
        //System.out.println(w1.toString());
        System.out.println(w1);

        System.out.println("——————————————————————————————————————————————");
        // 实例化Banana类对象，并传入相关参数值

        Banana b1=new Banana("仙人蕉","短而稍圆","香甜");
        // 调用子类的advantage和它的重载方法

        b1.advantage();
        b1.advantage("黄色");
    }
    //水果可供人们食用！
    //f1和f2的引用比较：true
    //————————————————————————————————————————
    //杨梅：紫红色、圆形果味酸甜适中
    //杨梅酸甜适中，非常好吃!
    //杨梅的信息：果实为圆形、紫红色,酸甜适中非常好吃!
    //——————————————————————————————————————————————
    //仙人蕉果形短而稍圆,果肉香甜,可供生食。
    //仙人蕉颜色为黄色
}
