package com;

/**
 * @author ：xuhang
 * @date ：Created in 2019/9/2 11:27
 * @description：
 * @version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        OldMan om = new OldMan("长者");
        YoungMan ym = new YoungMan("年轻人");
        bank.welcome(om);

    }
}
