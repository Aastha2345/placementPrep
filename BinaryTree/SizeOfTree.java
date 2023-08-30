package BinaryTree;
import java.util.Scanner;
public class SizeOfTree {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.println("Size of the tree is: "+sizeOfTree(root));
        System.out.println("Max in a binary tree is: "+maxTree(root));
        System.out.println("Min in a binary tree is: "+minTree(root));
    }

    // Size of the tree
    private static int sizeOfTree(Node root) {
        if(root==null)  return 0;
        return sizeOfTree(root.left)+sizeOfTree(root.right)+1;
    }

    // Max in Binary Tree
    private static int maxTree(Node root){
        if(root==null)  return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(maxTree(root.left),maxTree(root.right)));
    }

    // Min in Binary Tree
    private static int minTree(Node root){
        if(root==null)  return Integer.MAX_VALUE;
        return Math.min(root.data, Math.min(minTree(root.left),minTree(root.right)));
    }

    static Node createTree(){
        Node root = null;

        System.out.println("Enter the data: ");
        int data = sc.nextInt();
        if(data==-1)
            return null;
        root = new Node(data);
        System.out.println("Enter left for "+data);
        root.left=createTree();
        System.out.println("Enter right for "+data);
        root.right=createTree();
        return root;
    }

}

class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
    }
}
