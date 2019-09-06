package com;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/26 0:07
 * @description：
 * @version: V1.0
 */
public class SingleTon {

    private static SingleTon singleTon = new SingleTon();

    //将构造方法变成私有的
    private SingleTon(){

    }

    public static SingleTon getSingleTon(){
        return singleTon;
    }

    public static void main(String[] args) {
        new SingleTon();
    }



}
