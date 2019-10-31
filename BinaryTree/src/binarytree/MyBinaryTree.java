/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author Marlou Rentucan
 *
 */
public class MyBinaryTree {

    TreeNode root;

    public MyBinaryTree() {
        root = null;
    }

    public MyBinaryTree(TreeNode root) {
        this.root = root;
    }

    //FUNTIONS FOR TRAVERSE 
    public void visit(TreeNode p) {
        System.out.print(p.info + " ");
    }

    //pre-order
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        visit(root);             //should only 1 cause it has 1 expression ! 
        preOrder(root.left);     //actual visit arrangement sequence of PREORDER
        preOrder(root.right);

    }

    //in-order
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);           //actual visit arrangement sequence of INORDER
        visit(root);
        inOrder(root.right);
    }

    //posteorder
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);           //actual visit arrangement sequence of POSTORDER
        postOrder(root.right);
        visit(root);
    }

    //root view first ! 
    public void breadthFirst() {
        MyQueue mq = new MyQueue();
        mq.enqueue(root);
        TreeNode p;
        while (!mq.isEmpty()) {
            p = mq.dequeue();
            if (p.left != null) {
                mq.enqueue(p.left);
            }
            if (p.right != null) {
                mq.enqueue(p.right);
            }
            visit(p);
        }
    }
}
