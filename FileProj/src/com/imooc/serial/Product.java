package com.imooc.serial;

import java.io.Serializable;


public class Product implements Serializable {
    private String Id;
    private String name;
    private String categories;
    private double price;

    public Product(){

    }

    public Product(String id, String name, String categories, double price) {
        Id = id;
        this.name = name;
        this.categories = categories;
        this.price = price;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return "产品ID："+getId()+"\n产品名称："+getName()+"\n产品属性:"+getCategories()+"\n产品价格:"+getPrice()+"\n";
    }
}
