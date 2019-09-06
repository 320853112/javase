package computerroom;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/27 15:29
 * @description：
 * @version: V1.0
 */
public class Computer {

    private int number;

    public static final int OPEN = 1;

    public static final int USING = 2;

    public static final int CLOSE = 3;

    private int status = Computer.CLOSE;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void openComputer(){
        System.out.println("open computer");
        this.status = Computer.OPEN;
    }

    public void useComputer(){
        System.out.println("use computer");
        this.status = Computer.USING;
    }
    public void closeComputer(){
        System.out.println("close computer");
        this.status = Computer.CLOSE;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
