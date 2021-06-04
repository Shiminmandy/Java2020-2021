package com.imooc.file;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedPractice {
    public static void main(String[] args) {
        try {
            FileOutputStream fos1=new FileOutputStream("c:\\imooc\\io\\one.txt");
            FileOutputStream fos2=new FileOutputStream("c:\\imooc\\io\\two.txt");
            BufferedOutputStream bos=new BufferedOutputStream(fos2);
            long fos1StartTime=System.currentTimeMillis();
            for(int i=0;i<100000;i++){
                fos1.write('a');
            }
            long fos1EndTime=System.currentTimeMillis();
            System.out.println("one.txt不使用缓冲流来写");
            double time1=(fos1EndTime-fos1StartTime);
            System.out.println("用时为："+time1);
            long bosStartTime=System.currentTimeMillis();
            for(int j=0;j<100000;j++){
                bos.write('b');
            }
            bos.flush();
            long bosEndTime=System.currentTimeMillis();
            double time2=bosEndTime-bosStartTime;
            System.out.println("two.txt使用缓冲流来写");
            System.out.println("用时为："+time2);
            System.out.println("节省时间："+(time1-time2));
            fos1.close();
            fos2.close();
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
