package com.imooc.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo2 {
    public static void main(String[] args) {
        //创建一个FileInutStream对象
        try {
            FileInputStream fis=new FileInputStream("c:\\imooc\\io\\score.txt");
            byte[] b=new byte[100];
            fis.read(b);
            System.out.println(new String(b));
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
