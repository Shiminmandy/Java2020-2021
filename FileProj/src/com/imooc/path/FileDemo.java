package com.imooc.path;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File f=new File("c:\\imooc\\io\\score.txt");
        System.out.println(f.exists());
        System.out.println(f.isAbsolute());
    }
}
