package com;

/**
 * @author ：xuhang
 * @date ：Created in 2019/9/2 14:28
 * @description：
 * @version: V1.0
 */
public enum Day {
    //描述了当前类的七个对象
    monday("星期一",0),tuesday,wednesday,thursday,friday,saturday,sunday;



    private String name;

    private int index;

    private Day(){

    }

    private Day(String name ,int index ){
        this.name = name;
        this.index = index;
    }

}
