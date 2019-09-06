package class_load;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/26 20:57
 * @description：
 * @version: V1.0
 */
public class Person extends Animal{
    @Override
    public void eat() {
        System.out.println("人讲究好吃");
    }

    @Override
    public void sleep() {
        System.out.println("人讲究舒适");
    }
}

