package com.imooc.weather;

public class GenerateWeather implements Runnable{
    Weather weather;
    GenerateWeather(Weather weather){
        this.weather=weather;
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++);{
            weather.generate();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
