package com.imooc.priority;
class Mythread extends Thread{
    private String name;
    public Mythread(String name){
        this.name=name;
    }
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("线程"+name+"正在运行"+i);
        }
    }
}
public class PriorityDemo {
    public static void main(String[] args) {
        int mainPriority=Thread.currentThread().getPriority();
        //System.out.println("主线程的优先级为："+mainPriority);
        Mythread mt1=new Mythread("线程1");
        Mythread mt2=new Mythread("线程2");
        //mt1.setPriority(10);
        mt1.setPriority(Thread.MAX_PRIORITY);
        mt2.setPriority(Thread.MIN_PRIORITY);
        mt1.start();
        mt1.start();
        System.out.println("线程1的优先级为："+mt1.getPriority());
    }
}
