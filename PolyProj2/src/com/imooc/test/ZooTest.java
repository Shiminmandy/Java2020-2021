package com.imooc.test;

import com.imooc.zoo.*;

import java.util.Scanner;

public class ZooTest {
    public static void main (String[] args){

        //让客户选择是否一直循环
        while (true){

            System.out.println("*********欢迎来到太阳马戏团**********");
            System.out.println("*********请选择表演者**********");
            System.out.println("*********     1.棕熊     **********");
            System.out.println("*********     2.狮子     **********");
            System.out.println("*********     3.猴子     **********");
            System.out.println("*********     4.鹦鹉     **********");
            System.out.println("*********     5.小丑     **********");
            Scanner scanner=new Scanner(System.in);
            System.out.println("您选择的动物序号是：");
            //用户输入为int类型，则继续步骤；如果不是，则重新选择
            if (scanner.hasNextInt()){
                int choice=scanner.nextInt();
            /*插入if条件实例化不同的对象
            如果是1，则实例化棕熊类；
             如果是2，则实例化狮子类；
             如果是3，则实例化猴子类；
             如果是4，则实例化鹦鹉类；
             如果是5，则实例化小丑类；
            如果是其他，则打印"输入信息错误"，并重新重新选择
            */

                if(choice==1){
                    System.out.println("下面给您带来"+choice+"号动物的信息：");
                    Bear bear=new Bear();
                    bear.act();//每个表演者的信息通过调用act()方法输出
                }else if(choice==2){
                    System.out.println("下面给您带来"+choice+"号动物的信息：");
                    Lion lion=new Lion();
                    lion.act();
                }else if(choice==3){
                    System.out.println("下面给您带来"+choice+"号动物的信息：");
                    Monkey monkey=new Monkey();
                    monkey.act();
                }else if(choice==4){
                    System.out.println("下面给您带来"+choice+"号动物的信息：");
                    Parrot parrot=new Parrot();
                    parrot.act();
                }else if(choice==5){
                    System.out.println("下面给您带来"+choice+"号动物的信息：");
                    Clown clown=new Clown();
                    clown.act();
                }
                else{
                    System.out.println("输入信息不正确，请重新输入吧~");
                    continue;
                }}else{
                System.out.println("输入信息不正确，请重新输入吧~");
                continue;
            }


            //scanner.close();

            /*nested while loop完成是否继续的选择
              如果是1，则回到第一个循环；
              如果是0，则终止所有循环(return)；
              如果为其他，则打印输入信息错误并跳过此循环
             */

            while(true){
                System.out.println("**********示否继续观看(1/0)**********");
                if (scanner.hasNextInt()){
                    int answer=scanner.nextInt();
                    if (answer==1){
                        break;
                    }else if(answer==0){
                        return;
                    }else{
                        System.out.println("输入信息不正确，请重新输入吧~");
                        continue;
                    }
                }else{
                    System.out.println("输入信息不正确，请重新选择吧~");
                    break;
                }

            }
//
        }

    }
}
