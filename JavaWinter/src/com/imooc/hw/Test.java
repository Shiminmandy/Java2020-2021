package com.imooc.hw;

public class Test {
    public static void main(String[] args){
        Department D1=new Department("D001","人事部");
        //System.out.println(D1.getDepartName());
        Department D2=new Department("D002", "市场部");
        Position P1=new Position("P001","经理" );
        Position P2=new Position("P002","助理" );
        Position P3=new Position("P003","职员" );
        Employee E1=new Employee("张铭","S001",29,"男",D1,P1);
        System.out.println(E1.info());
    }
}
