package com;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/21 13:29
 * @description：
 * @version: V1.0
 */
public class ArrayBox {

    private int[] array;

    private int size;

    private boolean isFull;

    private int nowLocation;

    public ArrayBox(){
        this.array = new int[5];
        this.size = 5;
        this.isFull = false;
        this.nowLocation = 0;
    }

    public ArrayBox(int size){
        this.array = new int[size];
        this.size = size;
        this.isFull = false;
        this.nowLocation = 0;
    }

    private void addSpace(){
        this.size = this.size + 10;
        int[] newArray = new int[this.size];
        for(int i=0;i<this.nowLocation;i++){
            newArray[i] = this.array[i];
        }
        this.array = newArray;
    }

    public void add(int num){
        if(isFull)  this.addSpace();
        this.array[this.nowLocation++] = num;
        if(this.nowLocation==this.size)
            this.isFull = true;
    }

    public void add(int num,int index){
        if(index>this.nowLocation) {
            System.out.println("outOfBound");
            return;
        }
        if(isFull)  this.addSpace();
        for(int i = this.nowLocation-1;i>=index;i--){
            this.array[i+1] = this.array[i];
        }
        this.array[index] = num;
        this.nowLocation++;
    }

    //默认删除最末尾的一个元素
    public void delete(){
        if(this.nowLocation<=0) System.out.println("array is empty");
        this.nowLocation--;
        if(this.isFull) isFull = false;
    }
    public void delete(int index){
        if(this.nowLocation<=0) System.out.println("array is empty");
        for(int i = index ;i<this.nowLocation-1;i++){
            this.array[i] = this.array[i+1];
        }
        this.nowLocation--;
        if(this.isFull) isFull = false;
    }

    //默认获得最末尾的元素
    public Integer get(){
        return this.array[this.nowLocation-1];
    }

    public Integer get(int index){
        if(index>=this.nowLocation) {
            System.out.println("outOfBound");
            return null;
        }
        return this.array[index];
    }

    public void update(int num,int index){
        if(index>=this.nowLocation) {
            System.out.println("outOfBound");
            return;
        }
        this.array[index] = num;
    }

    public void lookAll(){
        for (int i=0;i<this.nowLocation;i++){
            System.out.println("第" +(i+1)+"个:"+this.array[i]);
        }
    }

}
