package linkedlist;

import java.util.Scanner;

/**
 *
 * @author Christian M. Abuda
 */
public class LinkedList {
    //Making an menu() method for easy access of the Menu code when needed.
    public static void menu(){
        System.out.println("Please choose the following menu: "
                + "[1] to add number in the list"
                + "[2] to delete the first number in the list"
                + "[3] to display all the number in the list"
                + "[4] to add the number between the list"
                + "[5] to check if the list is empty"
                + "[6] to exit the program");
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        DoublyLinkedList list = new DoublyLinkedList();
    }
}
class Node{
    int num;
    Node next;
    Node prev;
    
    public Node(int num){
        this.num = num;
        this.next = null;
        this.prev = null;
    }
}
class DoublyLinkedList{
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
            newNode.prev = tail;
            tail = newNode;
        }
        nodeCount++;
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("The list is Empty!");
        }else{
            if(head.next == null){
                head = null;
                tail = null;
            }else{
                head = head.next;
                head.prev = null;
            }
            
            if(head == null){
                tail = null;
            }
            nodeCount--;
        }
    }
    public void addbetween(int nodePosition, int num){
        if(head == null){
            System.out.println("The list is Empty");
            return;
        }else{
            Node currentNode = head;
            
            if(nodePosition > 0 || nodePosition < nodeCount){
                while(currentNode.next )
            }
        }
        
    }
    public boolean isEmpty(){
        return nodeCount == 0;
    }
}
