package com;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/30 14:30
 * @description：
 * @version: V1.0
 */
public class Main {
    public static void main(String[] args) {
        Object o = new Teacher(); //对象是老师对象,但是身份是人的身份  自动的向上转型
        Animal a = (Animal)o;
        System.out.println(a.name);
        a.sleep();
        a.eat();
        Person p = (Person)o;
        System.out.println(p.name);
        p.sleep();
        p.talk();
        p.eat();

        if(o instanceof Person){
            System.out.println("类型匹配");
//            Student s = (Student)o;//
//            s.study();
        }else{
            System.out.println("类型不匹配");
        }

    }
}
