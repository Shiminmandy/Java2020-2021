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
        Employee E2=new Employee("李艾爱","S002",21,"女",D1,P2);
        Employee E3=new Employee("孙超","S003",29,"男",D1,P3);
        Employee E4=new Employee("张美美","S004",26,"女",D2,P3);
        Employee E5=new Employee("蓝迪","S005",37,"男",D2,P1);
        Employee E6=new Employee("米莉","S006",24,"女",D2,P3);
        System.out.println(E1.info());
        System.out.println("==============================");
        System.out.println(E2.info());
        System.out.println("==============================");
        System.out.println(E3.info());
        System.out.println("==============================");
        System.out.println(E4.info());
        System.out.println("==============================");
        System.out.println(E5.info());
        System.out.println("==============================");
        System.out.println(E6.info());
        System.out.println("==============================");
    }
}
