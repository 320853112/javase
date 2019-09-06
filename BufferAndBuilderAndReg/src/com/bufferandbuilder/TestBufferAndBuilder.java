package com.bufferandbuilder;

/**
 * @author ：xuhang
 * @date ：Created in 2019/9/5 15:53
 * @description：
 * @version: V1.0
 */
public class TestBufferAndBuilder {
    public static void main(String[] args) {
        //无参构造默认创建长度为16的字符数组
        StringBuilder builder1 = new StringBuilder("abcdefg");
        StringBuffer buffer = new StringBuffer("abcdefg");
        System.out.println(builder1.substring(2, 5));
        builder1.delete(0,1);
        System.out.println(builder1);
    }
}
