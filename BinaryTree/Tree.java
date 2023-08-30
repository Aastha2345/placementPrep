package BinaryTree;
import java.util.Scanner;
public class Tree{
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        //System.out.print(root.data);
        System.out.println("Inorder traversal: ");
        inorder(root);
        System.out.println();
        System.out.println("Preorder traversal: ");
        preorder(root);
        System.out.println();
        System.out.println("Postorder traversal: ");
        postorder(root);
    }
    // Function to create a tree using recursion 
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
        root.right=createTree();

        return root;
    }

    // Inorder traversal using recursion
    static void inorder(Node root){
        if(root==null)  return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    // Preorder traversal using recursion
    static void preorder(Node root){
        if(root==null)  return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    // Postorder traversal using recursion
    static void postorder(Node root){
        if(root==null)  return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
}

// Class to create Node
class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
    }
}