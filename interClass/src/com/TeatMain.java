package com;

/**
 * @author ：xuhang
 * @date ：Created in 2019/9/2 12:37
 * @description：
 * @version: V1.0
 */
public class TeatMain {
    public static void main(String[] args) {
        Demo.InnerDemo innerDemo = new Demo().new InnerDemo();
        //调用内部类的方法
        innerDemo.testInnerDemo();
    }

}
