package com;

/**
 * @author ：xuhang
 * @date ：Created in 2019/9/2 15:28
 * @description：
 * @version: V1.0
 */
public class Person {

    Person(){
        System.out.println("object Construct");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object already GC");
    }
}
