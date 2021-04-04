package com.yc.file;

import java.io.*;

/**
 * @author 小潘
 * @create 2020-06-17-17:32
 */
public class FilePro {
    public static void main(String[] args) throws IOException {
        //获取某个文件夹下的所有文本文件
        File f = new File("E:\\Spring-Cloud\\src\\main\\java");
        for (File temp : f.listFiles()){
            if (temp.isFile()){
                System.out.println(temp.getName());
            }
        }
        System.out.println("--------------");
        /*
        读取一个文件夹里的文件和子文件里的文件
         */
        a(new File("E:\\测试读取文件"));

        // 输入流 实现外部文件内容的打印
        FileInputStream inputStream = new FileInputStream("E:\\测试读取文件\\bbbb.txt");
        byte [] b = new byte[1024];
        int len=0;
        while ((len=inputStream.read(b))!=-1){
            System.out.println(new String(b));
        }
        inputStream.close();

        // 输出流  实现内容的写出到外部
        FileOutputStream outputStream = new FileOutputStream("E:\\测试读取文件\\a\\bbbb888.txt");
        outputStream.write(b);
        outputStream.close();
    }

    public static void a(File f){
        if (f.isDirectory()){
            for (File temp : f.listFiles()){
                a(temp);
            }
        }else{
            System.out.println(f.getName());
        }
    }
}
