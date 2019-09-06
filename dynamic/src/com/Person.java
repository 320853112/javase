package com;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/30 14:27
 * @description：
 * @version: V1.0
 */
public class Person extends Animal{
    public String name = "person name";

    public void eat(){
        System.out.println("person eating");
    }

    public void sleep(){
        System.out.println("person sleep");
    }

    public void talk(){
        System.out.println("person talk");
    }
}
