package computerroom;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/27 15:29
 * @description：
 * @version: V1.0
 */
public class Room {

    private List<Computer> computers = new ArrayList();

    private int test ;

    {
        this.test =1;
    }

    public Room(){
        System.out.println("构造");
    }

    public void addComputer(Computer c){
        System.out.println("add a computer");
        computers.add(c);
    }

    public Computer getComputer(int index){
        return computers.get(index);
    }


    public void welcomeStudent(Student s){
        System.out.println("welcome student:"+s.getName());
    }

}
