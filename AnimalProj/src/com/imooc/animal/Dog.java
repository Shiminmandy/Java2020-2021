package com.imooc.animal;

public class Dog extends Animal{
    private String sex;

    //无参构造
    public Dog(){

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    //睡觉的方法
    public void sleep(){
        System.out.println("未加super的eat方法调用：");
        eat();//调用的是本类中的方法重写
        System.out.println("加上super的eat方法调用：");
        super.eat();//super:父类对象的引用
        System.out.println(this.getName()+"现在"+this.getMonth()+"月大，它在睡觉~~");
    }

    /*
     *方法重载：
     * 1.同一个类中
     * 2.方法名相同，参数列表不同（参数个数、顺序、类型）
     * 3.方法返回值、访问修饰符任意
     * 4.与方法参数名无关
     *
     * 方法重写：
     * 1.有继承关系的子类中
     * 2.方法名相同，参数列表相同（参数个数、顺序、类型）
     * 3.访问修饰符，访问范围需要大于等于父类的访问范围
     * 4.与方法的参数名无关
     * 5.当方法返回值是void或基本数据类型，必须相同；当返回值是引用类型时，可以是父类或其子类
     */

    //eat方法重写, 子类对象调用的是重写后的方法
    //注解
    @Override
    public void eat(){
        System.out.println(this.getName()+"最近没有食欲~~");
    }
}
