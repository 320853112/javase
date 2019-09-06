package com;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/30 16:46
 * @description：
 * @version: V1.0
 */
public class Bank {

    //开门等待业务
    public void welcome(Person person){
        System.out.println(person.getName()+"客户进入银行");
        person.callNumber();
        person.transact();
        person.leave();
    }


}
