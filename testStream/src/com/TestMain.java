package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author ：xuhang
 * @date ：Created in 2019/9/9 14:54
 * @description：
 * @version: V1.0
 */
public class TestMain {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            File file = new File("G://aaa");
            fis = new FileInputStream(file);
            System.out.println(fis.skip(5));
            System.out.println((char)fis.read());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fis!=null)
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


//        try {
//            File file = new File("G://test.txt");
//            FileInputStream fis = new FileInputStream(file);
//            int read; //读取一个字节 返回int类型的unicode码
//            byte[] b = new byte[5];
//            System.out.println("available"+fis.available());
//            int read1 = fis.read(b);
//            while (read1!=-1){
//                System.out.print(new String(b,0,read1));
//                read1 = fis.read(b);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
