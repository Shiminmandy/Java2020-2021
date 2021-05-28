package com.imooc.sleep;
class Letter implements Runnable{
    char[] letter=new char[26];
    //无参构造方法对数组进行循环赋值
    public  Letter(){
        int j=0;
        for(char i='a';i<='z';i++){
            letter[j]=i;
            j++;
        }
    }
    @Override
    public void run() {
        for(char c:letter){
            System.out.print(c);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class SleepPractice {
    public static void main(String[] args) {
        Letter lt=new Letter();
        Thread t1=new Thread(lt);
        t1.start();
    }
}
