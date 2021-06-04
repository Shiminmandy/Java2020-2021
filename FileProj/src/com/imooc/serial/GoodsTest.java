package com.imooc.serial;

import java.io.*;
/*
 *对象序列化：
 * 把JAVA对象转换为字节序列的过程
 *
 */
public class GoodsTest {
    public static void main(String[] args) {
        //定义Goods类的对象
        Goods goods1=new Goods("gd001","电脑",3000);
        try {
            //输出流：写
            FileOutputStream fos=new FileOutputStream("c:\\imooc\\io\\hello.txt");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            //输入流：读
            FileInputStream fis=new FileInputStream("c:\\imooc\\io\\hello.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            //将Goods对象信息写入文件
            oos.writeObject(goods1);
            oos.writeBoolean(true);
            oos.flush();
            //读对象信息
            try {
                Goods goods=(Goods)ois.readObject();//进行强制转换的原因：读出来的对象是Object类型
                System.out.println(goods);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            System.out.println(ois.readBoolean());
            fos.close();
            oos.close();
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
