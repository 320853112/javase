package com;

/**
 * @author ：xuhang
 * @date ：Created in 2019/9/6 14:20
 * @description：
 * @version: V1.0
 */
public class Person implements Comparable<Person>{
    private String name;
    private int testName;

    public int getTestName() {
        return testName;
    }

    public void setTestName(int testName) {
        this.testName = testName;
    }

    public Person(String name,int testName){
        this.name = name;
        this.testName = testName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if(obj instanceof Person){
            Person p = (Person) obj;
            if(this.name.equals(p.getName())) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;

    }

    @Override
    public int hashCode() {
        return this.name.hashCode();

    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.getName());
    }
}
