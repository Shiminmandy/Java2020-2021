package com.imooc.test;

import java.sql.SQLSyntaxErrorException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoOne {
    public static void main(String[] args){
    /*    //要求：定义两个整数，输出两数之商
        int one=12;
        int two=2;
        System.out.println("one和two的商是:"+(one/two));

     */
        //要求：定义两个整数，接受用户的键盘输入，输出两数之商
        Scanner input=new Scanner(System.in);
        System.out.println("=====运算开始=====");
        try{
            System.out.print("请输入第一个整数：");
            int one = input.nextInt();
            System.out.print("请输入第二个整数：");
            int two = input.nextInt();
            System.out.println("one和two的商是:" + (one / two));
        }catch(ArithmeticException e){
            System.exit(1);//终止程序运行，括号内只要为非0数字就能终止程序
            System.out.println("除数不允许为0~");
        }catch(InputMismatchException e){
            System.out.println("请输入整数~");
        } catch(Exception e){
            System.out.println("程序出错啦~");
            e.printStackTrace();
        }finally{
            System.out.println("=====运算结束=====");
            input.close();
        }
    }
}
