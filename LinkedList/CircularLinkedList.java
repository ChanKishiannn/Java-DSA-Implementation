package linkedlist;

import java.util.Scanner;
/**
 *
 * @author Christian M. Abuda
 */
public class LinkedList {
    public static void main(String[] args) {
        
        CircularLinkedList list = new CircularLinkedList();
    }
}
class Node{
    int num = 0;
    Node next;
    Node prev;
    
    public Node(int num){
        this.num = num;
        this.next = null;
        this.prev = null;
}
}
class CircularLinkedList{
    Node head;
    Node tail;
    
    public void addList(int userNum){
        Node newNode = new Node(userNum);
        
        if(isEmpty()){
            head = newNode;
            tail = newNode;
            
        }else{
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
            head.prev = tail;
        }
    }
    public void deleteList(){
        if(isEmpty()){
            System.out.println("The list is Empty!");
        }else{
            head = head.next;
            tail.next = head;
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
