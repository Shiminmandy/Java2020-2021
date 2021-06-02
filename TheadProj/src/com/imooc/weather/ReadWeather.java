package com.imooc.weather;

public class ReadWeather implements Runnable{
    Weather weather;
    ReadWeather(Weather weather){
        this.weather=weather;
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            weather.read();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
