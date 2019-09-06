package com;

/**
 * @author ：xuhang
 * @date ：Created in 2019/9/2 15:28
 * @description：
 * @version: V1.0
 */
public class Test {
    public static void main(String[] args) {

        Runtime r = Runtime.getRuntime();
        System.out.println(r.maxMemory());//整个对内存
        System.out.println(r.totalMemory());//可用的
        System.out.println(r.freeMemory());//可用中空闲的
        System.out.println("============================");
        byte[] b = new byte[1024];
        System.out.println(r.maxMemory());//整个对内存
        System.out.println(r.totalMemory());//可用的
        System.out.println(r.freeMemory());//可用中空闲的
    }
}
