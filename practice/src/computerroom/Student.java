package computerroom;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/27 15:29
 * @description：
 * @version: V1.0
 */
public class Student {

    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean useComputer(Computer c){
        if(c.getStatus()!=Computer.USING){
            c.setStatus(Computer.USING);
            return true;
        }
        return false;
    }

}
