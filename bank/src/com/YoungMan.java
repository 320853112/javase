package com;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/30 16:45
 * @description：
 * @version: V1.0
 */
public class YoungMan extends Person {


    public YoungMan(){

    }

    public YoungMan(String name){
        this.name = name;
    }

    //1.进银行叫号排队
    public void callNumber(){
        System.out.println("young call number");
    }
    //2.去窗口办理业务
    public void transact(){
        System.out.println("young got to the windows ,action");
    }

    //3.办完业务离开
    public void leave(){
        System.out.println("young fast leave");
    }

}
