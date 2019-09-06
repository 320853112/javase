package packageA;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/25 13:27
 * @description：
 * @version: V1.0
 */
public class TestA {

    public static void main(String[] args) {
        TestA testA = new TestA();
        testA.testprivate();
        testA.testpublic();
        testA.testdefault();
        testA.testprotected();
    }

    public final void testpublic(){
        System.out.println("我是TestA中的public修饰符的方法");
    }
    protected void testprotected(){
        System.out.println("我是TestA中的protected修饰符的方法");
    }
    void testdefault(){
        System.out.println("我是TestA中的默认修饰符的方法");
    }
    private void testprivate(){
        System.out.println("我是TestA中的private修饰符的方法");
    }
}
