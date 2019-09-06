package staticTest;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/25 21:31
 * @description：
 * @version: V1.0
 */
public class Person {

    public  String name;

    public static int age;


    static {
        System.out.println("块");
    }

    public void test(){
        System.out.println("我是普通方法");
        this.testStatic();
    }

    public static void testStatic(){

        System.out.println("我是静态方法");
    }

    public static void main(String[] args) {
        Person p1  =new Person();
        p1.name= "徐航";
        p1.age =18;
        Person p2 = new Person();
        p2.name = "小明";
        p2.age = 12;
        System.out.println(p1.name+p1.age);
        System.out.println(p2.name+p2.age);

    }
}
