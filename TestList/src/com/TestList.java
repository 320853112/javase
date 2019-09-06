package com;

import java.util.ArrayList;

/**
 * @author ：xuhang
 * @date ：Created in 2019/9/6 9:54
 * @description：
 * @version: V1.0
 */
public class TestList {
    public static void main(String[] args) {
        //ArrayList
        ArrayList<Integer> list1 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(90);
        list1.retainAll(list2);
        list1.set(0,111);
        Integer[] a = new Integer[list1.size()];
        list1.toArray(a);
        for (Integer integer : a) {
            System.out.println(integer);
        }
//        list1.clear();
        //addAll(Collection <? extends E> list)
        System.out.println(list1);

    }
}
