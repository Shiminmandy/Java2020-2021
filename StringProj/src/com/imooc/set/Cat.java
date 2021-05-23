package com.imooc.set;

import java.util.Objects;

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
        return "姓名："+name+",年龄："+month+",品种："+species;
    }

    @Override
    public boolean equals(Object obj) {
        //判断对象是否相等，相等则返回true，不用继续比较属性了
        if(this==obj){
            return true;
        }
        if(obj.getClass()==Cat.class){
            Cat cat=(Cat)obj;
            return cat.getName().equals(name)&&(cat.getMonth()==month)&&(cat.getSpecies().equals(species));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getMonth();
        result = 31 * result + getSpecies().hashCode();
        return result;
    }
}
