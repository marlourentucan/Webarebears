/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author Marlou Rentucan
 */
class Node {

    TreeNode info;
    Node next;

    public Node(TreeNode info) {
        this.info = info;
        next=null;
    }

}

public class MyQueue {

    Node first;
    Node last;

    public MyQueue() {
        first = last = null;
    }

    public void enqueue(TreeNode p) {
        Node x = new Node (p);
        if(first==null){
            first=last=x;
            return;
        }
        last.next = x;
        last =x;
    }
    public TreeNode dequeue(){
        Node x= first;
        first = first.next;
        return x.info;
    }
    public boolean isEmpty(){
        return (first==null);
    
    }
}
