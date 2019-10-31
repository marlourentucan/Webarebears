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
public class TreeNode {
    int info;
    TreeNode left;
    TreeNode right;
 
    public TreeNode(int info) { //creates Leaf node 
        this.info = info;
        left = right = null;
    }
    
}
