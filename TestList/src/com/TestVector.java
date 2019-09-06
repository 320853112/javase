package com;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Vector;

/**
 * @author ：xuhang
 * @date ：Created in 2019/9/6 13:06
 * @description：
 * @version: V1.0
 */
public class TestVector {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList();
        q.offer("1");
        q.offer("2");
        q.offer("3");
        q.poll();
        System.out.println(q);
    }
}
