package com;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/30 10:30
 * @description：
 * @version: V1.0
 */
public class LinkBox implements Box{

    //创建几个属性，记录头,尾节点
    private Node first;

    private Node last;

    //记录有效元素个数
    private int size;


    @Override
    public boolean add(int element) {
        this.linkLast(element);
        return true ;
    }

    @Override
    public int get(int index) {
        //先检测index是否合法
        rangeCheck(index);
        //找寻index对应位置的index对象，并取出数据
        return findNode(index).getItem();
    }

    @Override
    public int remove(int index) {
        //先检测index是否合法
        rangeCheck(index);
        Node targetNode = findNode(index);
        int oldValue = unlink(targetNode);
        return oldValue;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int index, int element) {

    }

    @Override
    public void addAll() {

    }

    //在节点后方添加节点
    private void linkLast(int element){
        //获取链表的尾节点
        Node lastNode = this.last;
        Node newNode = new Node(lastNode, element, null);
        this.last = newNode;
        //若链表是空的，则尾节点也是首节点
        if(lastNode ==null){
            first = newNode;
        }else{
            //将原来的尾节点的下一个节点设置为新节点
            lastNode.setNext(this.last);
        }
        //链表数量加一
        size++;
    }

    //检测index是否合法
    private void rangeCheck(int index){
        if(index<0||index >=size){
            throw new LinkBoxException("inde:"+index+"size:"+size);
        }
    }

    //根据index寻找node
    private Node findNode(int index){
        Node targetNode = first;//存储结果
        //判断index范围是在前半部分还是在后半部分
        if(index< size >>2 ){
            //在前半部分,从前往后找寻
            while(index-->0){
                targetNode=targetNode.getNext();
            }
        }else{
            //在后半部分,从后往前找寻
            index = size -index-1;
            while(index-->0){
                targetNode=targetNode.getNext();
            }
        }
        return targetNode;
    }

    //将给定的node对象删除,并保留删除元素
    private int unlink(Node target){
        //获取当前node的item信息
        //寻找前一个和后一个节点,将前一个和后一个连接
        //突然感受到了java的好处,可以不用手动释放内存,也不用在意前插和后插,哈哈
        //如果删到了头节点或尾节点
        int oldValue = target.getItem();
        Node preNode = target.getPrev();
        Node nextNode =  target.getNext();
        if(preNode==null){
            //是链表的头节点
            first = nextNode;
        }else{
            preNode.setNext(nextNode);
            target.setPrev(null);
        }
        if(nextNode==null){
            last = preNode;
        }else{
            nextNode.setPrev(preNode);
            target.setNext(null);
        }
        size--;
        return oldValue;
    }

}
