package com;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author ：xuhang
 * @date ：Created in 2019/9/6 13:53
 * @description：
 * @version: V1.0
 */
public class TestHashSet {
    public static void main(String[] args) {
        HashSet<String> strSet = new HashSet();
        strSet.add("xu");
        strSet.add("xu");
        strSet.add("xu");
        strSet.add("xu");
        strSet.add("xu");

        System.out.println(strSet.size());
        HashSet<Person> set = new HashSet();
        set.add(new Person("xu",1));
        set.add(new Person("xu",2));
        set.add(new Person("xu",3));
        set.add(new Person("xu",4));
        set.add(new Person("xu",5));
        Iterator<Person> iterator = set.iterator();
        System.out.println(iterator.next().getTestName());

    }
}
