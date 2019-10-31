/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * BINARY SEARCH TREE RECURSIVE, TRAVERSAL, (PRE,IN,POST)ORDER DEMONSTRATION USING JAVA IMPLEMENTATION
 * @author Marlou Rentucan
 */
public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        List<TreeNode> n = new ArrayList<>();
        List<TreeNode> Tn = new ArrayList<>();
        
        TreeNode Root = new TreeNode(0);;
        Scanner input = new Scanner (System.in);
        
        int inputs =0;
        System.out.println("Enter Tree Depth Level from zero(root) to: "); //root input and output
        inputs = input.nextInt();
        
        int loop =0;
        
        if (inputs ==0){loop=1;}
        if (inputs ==1){loop=3;}
        if (inputs ==2){loop=7;}
        if (inputs >2) {loop=1;}
        
        
        
        for (int i = 0; i < (Math.pow(2,inputs)-1); i++) {
           n.add(new TreeNode(input.nextInt()));
           
            if (i == 0) {
                Root = n.get(i); //root address in array list starts from zero
            }
            if (i > 1) { //hakuna matata !

                if (i % 2 == 0){ //right is even if the root starts in zero which it does
                n.get(i-1).right = n.get(i);
                }
                else {            //left is odd if the root starts in zero which it does
                n.get(i-1).left = n.get(i);
                }
                
            }

        }
        
        
        
        
        // TODO code application logic here
        //declare some nodes [to the tree]
       // TreeNode n1 = new TreeNode(35); //n1=1
      //  TreeNode n2 = new TreeNode(20); //n2=2
       // TreeNode n5 = new TreeNode(12); //n5=5
       // TreeNode n6 = new TreeNode(23); //n6=6 
      //  TreeNode n7 = new TreeNode(18); //n7=7 
      //  TreeNode n9 = new TreeNode(44); //n9=9
      //  TreeNode n3 = new TreeNode(52); //n9=9

      //  n6.left =n7;            //ROOOT    LEFT     (6)     RIGHT     
      //  n6.right =n9;           //        (7)   /          \   (9)
                                //   Left     right      left        right
      //  n7.left =n5;           //   (5) /    \ (2)       (1)/         \(null)
      //  n7.right =n2;
      //  n9.left =n1;
      //  n9.right =n3; 
        
        //root node here ! in mbt 
        MyBinaryTree mbt = new MyBinaryTree(Root);
        System.out.println("Your Input (root First)"); //root input and output
        mbt.breadthFirst();
        System.out.println("\n--------------Traversal Search-------------");
        System.out.println("\nPre - order: ");
        mbt.preOrder(mbt.root);
        System.out.println("\nIn - order");
        mbt.inOrder(mbt.root);
        System.out.println("\nPost - order");
        mbt.postOrder(mbt.root);
        
        
        System.out.println("\n\n\nCoded and arranged by Marlou Rentucan ! Source --> marlou.pb.gallery");
    }
    
}
