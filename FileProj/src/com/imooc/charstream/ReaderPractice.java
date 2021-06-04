package com.imooc.charstream;

import java.io.*;

public class ReaderPractice {
    public void transWriteByBuf(){
        try {
            FileOutputStream fos=new FileOutputStream("c:\\imooc\\io\\hello.txt");
            OutputStreamWriter osw=new OutputStreamWriter(fos);
            BufferedWriter bw=new BufferedWriter(osw);
            bw.write("你好吗？\n");
            bw.write("我很好！\n");
            bw.write("那真好！");
            bw.flush();
            fos.close();
            osw.close();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void transReadByBuf(){
        try{
            FileInputStream fis=new FileInputStream("c:\\imooc\\io\\hello.txt");
            InputStreamReader isr=new InputStreamReader(fis);
            BufferedReader br=new BufferedReader(isr);
            String str;
            while((str=br.readLine())!=null){
                System.out.println(str);
            }
            fis.close();
            isr.close();
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ReaderPractice rp=new ReaderPractice();
        rp.transWriteByBuf();
        rp.transReadByBuf();



    }
}
