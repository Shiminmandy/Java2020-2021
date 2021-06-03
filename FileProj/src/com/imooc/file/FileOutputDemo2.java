package com.imooc.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo2 {
    public static void main(String[] args) {
        //文件拷贝
        FileInputStream fis;
        FileOutputStream fos;
        {
            try {
                fis = new FileInputStream("FileProj\\happy.jpg");
                fos=new FileOutputStream("FileProj\\happycopy.jpg");//同一个目录下名字不能一样
                int n=0;
                byte[] b=new byte[1024];
                while((n=fis.read(b))!=-1){
                    fos.write(b,0,n);
                }
                fis.close();
                fos.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
