package com;

import java.util.Scanner;

/**
 * @author ：xuhang
 * @date ：Created in 2019/9/2 14:22
 * @description：
 * @version: V1.0
 */
public class TestMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String res = sc.nextLine();
        Day res1 = Day.valueOf(res);
        switch(res1){
            case monday:
                System.out.println("monday");break;
            case tuesday:
                System.out.println("tuesday");break;
        }


    }
}
