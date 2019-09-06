package class_load;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/26 22:01
 * @description：
 * @version: V1.0
 */
public class Pig  extends Animal{

    @Override
    public void eat() {
        System.out.println("猪吃饲料");
    }

    @Override
    public void sleep() {
        System.out.println("猪住猪窝");
    }
}
