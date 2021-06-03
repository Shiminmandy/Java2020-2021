package com.imooc.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo1 {
    public static void main(String[] args) {
        FileOutputStream fos;
        FileInputStream fis;
        try {
            fos=new FileOutputStream("c:\\imooc\\io\\score.txt",true);
            fis=new FileInputStream("c:\\imooc\\io\\score.txt");
            fos.write(50);
            fos.write('a');
            System.out.println(fis.read());
            System.out.println((char)fis.read());
            fos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
