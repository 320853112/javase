package com;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/30 10:27
 * @description：
 * @version: V1.0
 */
public interface Box {

    boolean add(int element);
    void add(int index,int element);
    void addAll();
    int get(int index);
    int remove (int index);
    int size();
}
