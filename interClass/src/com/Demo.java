package com;

/**
 * @author ：xuhang
 * @date ：Created in 2019/9/2 12:38
 * @description：
 * @version: V1.0
 */
public class Demo {
    private String name = "正常类中的属性";

    public void testDemo(){
        System.out.println("正常类中的方法");
    }

    public void testDemo1(){
        //定义一个局部内部类
        class InnerTestOneMEthod{

        }
    }


    //成员内部类
    public class InnerDemo{
        private String name = "内部类属性";

        public void testInnerDemo(){
            System.out.println("成员内部类的方法"+this.name);
            testDemo();
        }
    }

}
