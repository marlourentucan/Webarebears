/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytreetraversal;

/**
 *
 * @author Marlou Rentucan
 */
public class Node {
    public Node leftChild;
    public Node rightChild;
    private int data;
    
    public Node(){
    leftChild = null;
    rightChild = null;
    data = 0;
    }
    public Node (int value){
    leftChild = rightChild = null;
    this.data= value;
    }
    public void setData(int value){
    this.data = value;
    }
    public int getData(){
    return data;
    }
    
}
