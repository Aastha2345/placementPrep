package BinaryTree;

import java.util.Scanner;

public class HeightMax{
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.println("The max height of the binary tree is: "+ maxHeight(root));
    }

    static Node createTree(){
        Node root = null;
        System.out.println("Enter the data: ");
        int data = sc.nextInt();
        if(data==-1)
            return null;
        
        root = new Node(data);
        System.out.println("Enter left for "+data);
        root.left = createTree();
        System.out.println("Enter right for "+data);
        root.right = createTree();

        return root;
    }

    static int maxHeight(Node root){
        if(root==null)
            return 0;
        return Math.max(maxHeight(root.left), maxHeight(root.right))+1;
    }
}

class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
    }
}