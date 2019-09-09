package com;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author ：xuhang
 * @date ：Created in 2019/9/9 16:11
 * @description：
 * @version: V1.0
 */
public class TestFileOutputStream {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("G://test.txt");
            fos.write(97);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
                try {
                    if(fos!=null) {
                        fos.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }
}
