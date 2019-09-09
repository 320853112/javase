package com;

/**
 * @author ：xuhang
 * @date ：Created in 2019/9/9 9:55
 * @description：
 * @version: V1.0
 */
public class TestMain {

    public void testMyException() throws MyException{
        System.out.println("测试自定义异常的方法");
        if(3>2){
            throw new MyException("说明一下异常");
        }
    }

    public String testException() throws NullPointerException{
        String str = null;
        str.length();
        return "返回值";
    }

    public static void main(String[] args) {
        try{
            new TestMain().testMyException();
        }finally{

        }
    }
}
