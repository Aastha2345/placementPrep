package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelOrderTraverse {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();
        System.out.println("The max height of the binary tree is: "+ maxHeight(root));
        // for(int i=1;i<=maxHeight(root);i++){
        //     //System.out.println("\nLevel "+i+":");  // Used to print level in diff lines
        //     printCurrentLevel(root,i);
        // }
        printLevelOrder(root);
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
    
    // Approach 1: Print current levels : level 1, level 2, level 3,.....
    static void printCurrentLevel(Node root, int level){
        if(root==null)
            return;
        if(level==1)
            System.out.print(root.data+" ");
        else if (level>1){
            printCurrentLevel(root.left, level-1);
            printCurrentLevel(root.right, level-1);
        }
    }
    // Approach 2: Using queue data structure 
    static void printLevelOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null); // We add null for just adding a new line fpr evey new level.
        while(!q.isEmpty()){
            Node curr = q.poll();
            // To break line after every level
            if(curr==null){
                if(q.isEmpty())
                    return;
                q.add(null);  // It will add null at the back of the queue.
                System.out.println();
                continue;
            }
            System.out.print(curr.data+" ");
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
    }
}
class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
    }
}