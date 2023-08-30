package BinaryTree;
import java.util.Scanner;
public class Left_RightView {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();

    }
    static Node createTree(){
        Node root = null;

        System.out.println("Enter the data: ");
        int data = sc.nextInt();
        if(data==-1)
            return null;
        root = new Node(data);
        if(root.left!=null){
            root.left = createTree();
        }
        if(root.right!=null){
            root.right = createTree();
        }
        return root;
    }

    public void rightView(Node curr,List<Integer> res, int level){
        if(curr==null)
            return;
        if(level == res.size()){
            res.add(curr.data);
        }
        rightView(curr.right, res, level+1);
        rightView(curr.left, res, level+1);
    }
}
class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
    }
}