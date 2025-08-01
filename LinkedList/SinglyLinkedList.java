package linkedlist;

/**
 *
 * @author Christian M. Abuda
 */
public class LinkedList {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        
    }   
}
class Node{
    int num;
    Node next;
    
    public Node(int num){
        this.num = num;
        this.next = null;
    }
}
class SinglyLinkedList{
    Node head;
    Node tail;
    
    private int nodeCount = 0;
    
    public void offer(int num){
        Node newNode = new Node(num);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = tail.next;
        }
        nodeCount++;
    }
    public void poll(){
        if(isEmpty()){
            System.out.println("The Linked List is Empty!");
        }else{
            head = head.next;
            nodeCount--;
            
            if(head == null){
                tail = null;
            }
        }
    }
    public void display(){
        Node currentNode = head;
        
        if(isEmpty()){
            System.out.println("The Linked List is Empty!");
        }else{
            while(currentNode != null){
                System.out.print("\nThe number on the Node is: " + currentNode.num);
                currentNode = currentNode.next;
            }
        }
    } 
    public void addNum(int newNodePosition, int newNodeValue){
        Node newNode = new Node(newNodeValue);
        if(isEmpty()){
            System.out.println("The List is Empty! Add number first");
        }else{
            Node current = head;  
            
            if(newNodePosition < 0 || newNodePosition >= nodeCount){
                System.out.println("Invalid Node Position Value!");
            }else{
               for(int i = 0; i < newNodePosition; i++){
            current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode; 
            }
            if(newNode.next == null){
                tail = newNode;
            }
        }
        nodeCount++;
    }
    public boolean isEmpty(){
        if(head == null){
            return true;
        }else{
            return false;
        }
    }
}
