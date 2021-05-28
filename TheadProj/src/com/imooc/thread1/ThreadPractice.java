package com.imooc.thread1;
class Printer extends Thread {
    public Printer(String name){
        super(name);
    }
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(getName()+"正在打印"+i);
        }
    }
}
public class ThreadPractice {
    public static void main(String[] args) {
        Printer p1=new Printer("打印机");
        p1.start();
    }
}
