package class_load;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/26 21:03
 * @description：
 * @version: V1.0
 */
public class Test {
    public static void main(String[] args) {
        Person p = new Person();
        p.eat();
        Pig pig = new Pig();
        p.eat();
    }
}
