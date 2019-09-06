package com;

/**
 * @author ：xuhang
 * @date ：Created in 2019/8/30 10:56
 * @description：
 * @version: V1.0
 */
public class Node {

    private Node prev;//previous

    private int item;

    private Node next;//存储下一个节点

    public Node(Node prev,int item,Node next){
        this.prev = prev;
        this.item = item;
        this.next = next;
    }


    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
