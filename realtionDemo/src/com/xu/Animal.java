package com.xu;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/23 17:29
 * @description：
 * @version: V1.0
 */
public class Animal {

    public Animal(){
        System.out.println("this is Animal constrcutMethod");
    }

    public String name;

    public void eat(){
        System.out.println("animal eat method");
    }

    public void sleep(){
        this.eat();
        System.out.println("animal sleep method");
    }
}
