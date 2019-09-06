package com;

import java.math.BigInteger;

/**
 * @author ：xuhang
 * @date ：Created in 2019/9/3 10:49
 * @description：
 * @version: V1.0
 */
public class jiecheng {
    //设计一个方法来计算给定数字的阶乘
    public static BigInteger jicheng(int n){
        BigInteger res = new BigInteger("1");
        for(int i = 1;i<=n;i++){
            res = res.multiply(new BigInteger(i+""));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(jicheng(100));
    }
}
