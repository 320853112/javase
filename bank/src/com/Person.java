package com;

/**
 * @author ：xuhang
 * @date ：Created in 2019/9/2 11:37
 * @description：
 * @version: V1.0
 */
public abstract class Person {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //1.进银行叫号排队
    public abstract void callNumber();
    //2.去窗口办理业务
    public abstract void transact();

    //3.办完业务离开
    public abstract void leave();

}
