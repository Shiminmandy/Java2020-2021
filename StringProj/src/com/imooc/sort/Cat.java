package com.imooc.sort;

public class Cat {
    private String name;//名字
    private int month;//年龄
    private String species;//品种
    //无参构造方法
    public Cat(){

    }

    public Cat(String name, int month, String species) {
        this.name = name;
        this.month = month;
        this.species = species;
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

    public String toString(){
        return "[姓名："+name+",年龄："+month+",品种："+species+"]";
    }

}
