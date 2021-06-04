package com.imooc.file;

import java.io.*;

public class BufferedDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fos=new FileOutputStream("c:\\imooc\\io\\score.txt");
            BufferedOutputStream bos=new BufferedOutputStream(fos);
            FileInputStream fis=new FileInputStream("c:\\imooc\\io\\score.txt");
            BufferedInputStream bis=new BufferedInputStream(fis);
            long startTime=System.currentTimeMillis();
            bos.write(50);
            bos.write('a');
            bos.flush();
            System.out.println(bis.read());
            System.out.println((char)bis.read());
            long endTime=System.currentTimeMillis();
            System.out.println(endTime-startTime);
            fos.close();
            bos.close();
            fis.close();
            bis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
