package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class IterativeTraversal {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.println(inorderIterative(root));
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
        root.right=createTree();
        return root;
    }

    static public List<Integer> inorderIterative(Node root){
        List<Integer> result = new ArrayList<Integer>();
        Stack<Node> st = new Stack<Node>();
        Node node = root;
        while(true){
            if(node!=null){
                st.push(node);
                node = node.left;
            }
            else{
                if(!st.isEmpty())
                    break;
                node = st.pop(); 
                result.add(node.data);
                node = node.right;
            }
        }
        return result;
    }
}

class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
    }
}
