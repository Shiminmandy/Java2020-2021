package com.imooc.animal;

import java.security.PrivateKey;

public class Animal {
    /*private:只允许在本包中进行访问
     *public:允许在任意位置访问
     * protected:允许在当前类、同包子类/非子类、跨包子类调用；跨包非子类不允许
     * 默认：允许在当前、同包子类/非子类调用；跨包子类/非子类不允许
     */
    private String name;//昵称
    private int month;//月份
    private String species;//品种
    //在子类中，可以定义与父类重名的属性
    public int temp=15;

    private static int st1=22;
    private static int st2=23;

    static{
        System.out.println("我是父类的静态代码块");
    }
    {
        System.out.println("我是父类的构造代码块");
    }
    //父类的构造不允许被继承，不允许被重写，但是会影响子类对象的实例化
    public Animal(){
        System.out.println("我是父类的无参构造方法");
    }

    public Animal(String name,int month){
        System.out.println("我是父类的代参构造方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    //吃东西
    public void eat(){
        System.out.println(this.getName()+"在吃东西");
    }
}
