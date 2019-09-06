package com;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/30 16:44
 * @description：
 * @version: V1.0
 */
public class OldMan extends Person{


    public OldMan(){

    }

    public OldMan(String name){
        this.name = name;
    }


    //1.进银行叫号排队
    public void callNumber(){
        System.out.println("the oldman can't get number,want a hand");
    }
    //2.去窗口办理业务
    public void transact(){
        System.out.println("the oldman open clothes ,get money");
    }
    //3.办完业务离开
    public void leave(){
        System.out.println("oldman leave");
    }



}
