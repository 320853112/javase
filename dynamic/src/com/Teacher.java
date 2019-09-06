package com;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/30 14:29
 * @description：
 * @version: V1.0
 */
public class Teacher extends Person{

    public String name = "teacher name";

    public void eat() {
        System.out.println("teacher eating");
    }

    public void teach(){
        System.out.println("teacher teach students");
    }
}
