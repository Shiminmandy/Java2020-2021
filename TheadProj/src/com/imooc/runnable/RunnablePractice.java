package com.imooc.runnable;
class Dog implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName()+"A dog");
        }
    }
}
class Cat implements Runnable{

    @Override
    public void run() {
        for(int i=1;i<=3;i++){
            System.out.println(Thread.currentThread().getName()+"A cat");
        }
    }
}
public class RunnablePractice {
    public static void main(String[] args) {
        Dog d1=new Dog();
        Thread t1=new Thread(d1);
        t1.start();
        Cat c1=new Cat();
        Thread t2=new Thread(c1);
        t2.start();
        for(int i=1;i<=3;i++){
            System.out.println("main thread");
        }
    }
}
