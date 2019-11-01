/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytreetraversal;

import java.util.Scanner;

/**
 *
 * @author Marlou Rentucan
 */
//THIS CODE DEMONSTRATES BASIC BINARY TREE OPERATIONS INSERT DATA, (TRAVERSAL SEARCH--> INORDER POSTORDER PREORDER )
//NO DELETE CAUSE IT WAS NOT INSTRUCTED TO BE DONE.. AND NOT DISCUSSED. 
public class BinaryTreeTraversal {

    /**
     * @param args the command line arguments
     */
    public static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getData() + " ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);
    }

    public static void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.leftChild);
        System.out.print(root.getData() + " ");
        inOrderTraversal(root.rightChild);
    }

    public static void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.getData() + " ");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int root =0;
        BST bst = new BST();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Binary Search Tree.");

        System.out.println("Enter Tree depth level from zero(root) to: ");
        int length = input.nextInt();
        
         length = length +1;
         int scale = (int) (Math.abs(Math.pow(2, length) - 1)); 
        int num[] = new int[scale];
         
        if ((length) < 0) {
            System.out.println("Sorry Please enter a valid input. Try again");
        }
        if ((length) == 0) {
            System.out.println("Enter Entry no. 1 of 1 :");
            bst.add(input.nextInt());
        }
        if ((length-1) > 0) {
            
            
            
            for (int i = 0; i < scale; i++) {
                System.out.println("Enter Entry no. " + (i + 1) + " of " + scale + ": ");
                int inputs = input.nextInt();
                bst.add(inputs);
                num[i] = inputs;
                if (i==0){ root = inputs;}
            }
        } 
        
        
        
        //sample inputs from ppt
        // bst.add(23);
        // bst.add(18);
        // bst.add(44);
        // bst.add(12);
        // bst.add(20);
        // bst.add(35);
        // bst.add(52);
         System.out.println("\nInitial Inputs: ");
         
     for (int i = 0; i < scale; i++) {
                System.out.print(num[i]+" " );
        } 
        
         System.out.println("\nRoot: " + root);
         
         
        System.out.println("--------------------Traversal---------------");
        System.out.println("\nPreOrder: ");
        preOrderTraversal(bst.root);
        System.out.println("\nInOrder: ");
        inOrderTraversal(bst.root);
        System.out.println("\nPostOrder: ");
        postOrderTraversal(bst.root);
        System.out.println("\n\nCompiled and coded by Marlou Rentucan");
    }

}
