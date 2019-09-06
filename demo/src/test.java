import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/21 19:29
 * @description：
 * @version: V1.0
 */
public class test {
    public static void main(String[] args){
        List<String> ansNum = Arrays.asList("12333334444444".split(""));
        if(ansNum.contains(String.valueOf(4))){
            System.out.println("ok");
        }
    }
}
