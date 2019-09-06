package com;

/**
 * @author ：xuhang
 * @date ：Created in 2019/9/3 14:22
 * @description：
 * @version: V1.0
 */
public class TestString {
    public static void main(String[] args){
        String a  ="ABC";
        String b = "abc";
        System.out.println(a.compareTo(b));
        System.out.println(a.compareToIgnoreCase(b));
    }
}
