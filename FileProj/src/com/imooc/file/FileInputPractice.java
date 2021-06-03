package com.imooc.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputPractice {
    public static void main(String[] args) {
        try {
            File file=new File("c:\\imooc\\io\\speech.txt");
            FileInputStream fis=new FileInputStream(file);
            int text=0;
            int count=0;
            System.out.print("文本内容：");
            while((text=fis.read())!=-1){
                System.out.print((char)text);
                count+=1;
            }
            fis.close();
            System.out.println();
            System.out.println("统计结果："+file.getName()+"文件中共有"+count+"个字节");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
