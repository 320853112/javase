package com;

import java.util.*;

/**
 * @author ：xuhang
 * @date ：Created in 2019/9/6 15:25
 * @description：
 * @version: V1.0
 */
public class TestTreeSet {
    public static void main(String[] args){
        TreeMap<Integer,String> map = new TreeMap();
        map.put(2,"b");
        map.put(3,"c");
        map.put(1,"f");
        Iterator<Integer> iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(map.get(iterator.next()));
        }
    }


}
