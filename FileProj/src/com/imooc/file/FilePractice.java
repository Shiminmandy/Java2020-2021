package com.imooc.file;

import java.io.File;
import java.io.IOException;

public class FilePractice {
    public static void main(String[] args) {
        File file=new File("c:\\imooc\\File");
        if(!file.exists()){
            file.mkdir();
        }
        File file1=new File("c:\\imooc\\File\\Monday.docx");
        if(!file1.exists()){
            try {
                file1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("创建文件成功");
        System.out.println("文件名称："+file1.getName());
        System.out.println("文件上一级目录："+file1.getParentFile().getName());
        if(file1.isFile()){
            System.out.println("文件/目录:这是一个文件");
        }else{
            System.out.println("文件/目录:这不是一个文件");
        }
        if(file1.canRead()){
            if(file1.canWrite()){
                System.out.println("读写性：这个文件既可以读还可以写。");
            }
        }
    }
}
