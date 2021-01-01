package com.imooc.animal;

import java.security.PrivateKey;

public class Animal {
    private String name;//昵称
    private int month;//月份
    private String species;//品种
    //在子类中，可以定义与父类重名的属性
    public int temp=15;

    public Animal(){

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
