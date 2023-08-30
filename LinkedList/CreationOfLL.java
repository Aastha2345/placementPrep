package LinkedList;
public class CreationOfLL {
    Node head;
    private int size;
    
    // Constructor created for the size of the LL
    CreationOfLL(){
        this.size = 0;
    }
    
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
            size++; // Whenever new node is created it will increment it.
        }
    }
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void addPosition(Node prevNode, int data){
        Node newNode = new Node(data);
        if(prevNode == null){
            System.out.println("The given previous node is not present.");
            return;
        }
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void deleteFirst(){
        if(head==null){
            System.out.println("Linked List Underflow!");
            return;
        }
        head = head.next;
        size--; // When we delete it will decrement it.
    }

    public void deleteLast(){
        size--; // We have used it beacuse we also want the single node in the LL to be counted.
        if (head == null || head.next == null ) {
            // If the linked list contains only one element or no elements at all 
            head = null;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    void traverse(){
        Node currNode = head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    
    // This function tells the size of the Linked List
    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        CreationOfLL list = new CreationOfLL();
        list.addFirst(20);
        list.addFirst(10);
        list.addLast(30);
        list.addPosition(list.head, 40);

        list.traverse();
        System.out.println(list.getSize());
        list.deleteFirst();
        list.traverse();
        list.deleteLast();
        list.traverse();
        System.out.println(list.getSize());
    }
}

