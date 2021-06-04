package com.imooc.charstream;

import java.io.*;
//字符流
//使用缓冲流可以提高读写速率
public class ReaderDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("c:\\imooc\\io\\read.txt");
            InputStreamReader isr=new InputStreamReader(fis);
            BufferedReader br=new BufferedReader(isr);
            FileOutputStream fos=new FileOutputStream("c:\\imooc\\io\\write.txt");
            OutputStreamWriter osw=new OutputStreamWriter(fos);
            BufferedWriter bw=new BufferedWriter(osw);
            int n=0;
            char[] cbuf=new char[10];//文件中是中文字符
            /*
              方法1
              while((n=isr.read())!=-1){
                System.out.print((char)n);
            }
             */
            /*
             方法2
             while((n=isr.read(cbuf))!=-1){
                String s=new String(cbuf,0,n);
                System.out.println(s);
            }
             */
            while((n=br.read(cbuf))!=-1){
                //String s=new String(cbuf,0,n);
                bw.write(cbuf,0,n);
                bw.flush();
            }
            fis.close();
            fos.close();
            isr.close();
            osw.close();
            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
