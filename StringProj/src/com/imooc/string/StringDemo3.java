package com.imooc.string;

public class StringDemo3 {
    public static void main(String[] args){
        //字符串和byte数组只简单相互转换
        //定义一个字符串
        String str=new String("JAVA 编程 基础");
        //将字符串转化为byte数组，并打印输出
        byte[] arrs=str.getBytes();
        for(int i=0;i<arrs.length;i++)
            System.out.print(arrs[i]+" ");

        System.out.println();
        //将byte数组转化为字符串
        String str1=new String(arrs);
        System.out.println(str1);
    }
}
