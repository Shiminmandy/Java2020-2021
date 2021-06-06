package com.imooc.serial;

import java.io.*;

public class ProductTest {
    public static void main(String[] args) {
        Product iphone=new Product("123","iphone","telephone",4888);
        Product ipad=new Product("234","ipad","computer",5088);
        Product macbook=new Product("345","macbook","computer",10688);
        Product iwatch=new Product("256","iwatch","watch",4799);
        try {
            //输出流
            FileOutputStream fos=new FileOutputStream("c:\\imooc\\io\\hello.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            //输入流
            FileInputStream fis=new FileInputStream("c:\\imooc\\io\\hello.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            //将Product对象信息写入文件
            oos.writeObject(iphone);
            oos.writeObject(ipad);
            oos.writeObject(macbook);
            oos.writeObject(iwatch);
            oos.flush();
            //读信息
            try {
//                Product product1=(Product) ois.readObject();
//                System.out.println(product1);
//                Product product2=(Product) ois.readObject();
//                System.out.println(product2);
//                Product product3=(Product) ois.readObject();
//                System.out.println(product3);
//                Product product4=(Product) ois.readObject();
//                System.out.println(product4);
                for (int i = 0; i < 4; i++) {
                    //循环读取对象
                    System.out.println(ois.readObject());
                }
                //关闭流时，先打开的后关闭，后打开的先关闭
                ois.close();
                fis.close();
                oos.close();
                fos.close();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
