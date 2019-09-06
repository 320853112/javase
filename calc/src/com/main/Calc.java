package com.main;

import org.omg.CORBA.INTERNAL;

import java.util.Scanner;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/21 12:59
 * @description：
 * @version: V1.0
 */
public class Calc {

    private Integer num1;

    private Integer num2;

    private String operation;

    public void inputNum1(){
        System.out.println("please input first num");
        Scanner sc = new Scanner(System.in);
        this.num1 = sc.nextInt();
    }

    public void inputNum2(){
        System.out.println("please input second num");
        Scanner sc = new Scanner(System.in);
        this.num2 = sc.nextInt();
    }

    public void inputOperation() {
        System.out.println("please input symbol");
        Scanner sc = new Scanner(System.in);
        this.operation = sc.next();
        switch (operation) {
            case "+":
                return;
            case "-":
                return;
            case "*":
                return;
            case "/":
                return;
            default:
                System.out.println("input symbol error! please try again");
                this.inputOperation();
        }
    }

    public Integer count(){
        Integer res = null;
        switch (operation){
            case "+" : res = num1 + num2 ;break;
            case "-" : res = num1 -num2 ;break;
            case "*" : res = num1 * num2 ;break;
            case "/" : res = num1 / num2 ;break;
            default:
                System.out.println("para error");
        }
        System.out.println("res:"+res);
        return res;
    }

    public void start(){
        System.out.println("calc already run,please press 's' to start");
        Scanner sc = new Scanner(System.in);
        while(!(sc.next().equals("q"))){
            this.inputNum1();
            this.inputOperation();
            this.inputNum2();
            this.count();
            System.out.println("please press 'q' for quit,or press 's' to continue");
        }
        System.out.println("bye bye!");
    }

}
