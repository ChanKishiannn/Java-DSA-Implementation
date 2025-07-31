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
    public boolean isEmpty(){
        if(head == null){
            return true;
        }else{
            return false;
        }
    }
}
