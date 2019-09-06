package com;

import java.util.LinkedList;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/30 10:07
 * @description：
 * @version: V1.0
 */
public class Main {
    public static void main(String[] args) {
        LinkBox linkBox = new LinkBox();
        linkBox.add(10);
        int v1 = linkBox.remove(0);
        int v2 = linkBox.get(0);
        linkBox.size();
    }
}
