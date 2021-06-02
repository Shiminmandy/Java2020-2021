package com.imooc.weather;
//天气类
public class Weather {
    private int temp;
    private int humidity;
    boolean flag=false;

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public String toString(){
        return "[温度："+temp+"，湿度："+humidity+"]";
    }

    //生成天气数据
    public synchronized void generate(){
        if (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setTemp((int)(Math.random()*40));
        this.setHumidity((int)(Math.random()*100));
        System.out.println("生成天气数据"+toString());
        flag=true;
        notifyAll();

    }
    //读取天气数据
    public synchronized void read(){
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("读取天气数据"+toString());
        flag=false;
        notifyAll();

    }
}
