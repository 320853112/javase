package com;

import sun.text.resources.cldr.eo.FormatData_eo;

import java.io.File;
import java.io.IOException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Properties;

/**
 * @author ：xuhang
 * @date ：Created in 2019/9/9 11:08
 * @description：
 * @version: V1.0
 */
public class TestMain {

    public  void  allDelete(File file){
        if(file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                this.allDelete(f);
            }
        }
        file.delete();

    }

    public  File[] getChildFile(File file){
        //设置递归出口
        if(file.isFile())
            return null;
        //递归找到子文件
        File[] list = file.listFiles();
        for (File f : list) {
            this.getChildFile(f);
            System.out.println(f.getAbsolutePath());
        }
        return list;
    }

    public static void main(String[] args) {
        File file = new File("G://aaa");
        new TestMain().allDelete(file);
    }
}
