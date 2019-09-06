package com.xu;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/23 17:29
 * @description：
 * @version: V1.0
 */
public class Person extends Animal{

    public Person(){
        System.out.println("this is person constructMethod");
    }

    public void study(){
        System.out.println("I can study");
    }

    public void eat(){
        System.out.println("person can eat well");
    }

}
