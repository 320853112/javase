package com.xu.contain;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/25 11:16
 * @description：
 * @version: V1.0
 */
public class Car {

    public String brand ;
    public String type;
    public String color;

    public Whell whell;

    public void showCar(){
        System.out.println("这是一辆"+brand+"的"+type+"型号的"+color+"的小汽车");
        System.out.println("车上搭载着"+whell.brand+"牌的"+whell.size+"尺寸"+whell.color+"颜色的汽车");
        whell.turn();
    }
}
