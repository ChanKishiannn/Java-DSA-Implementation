package linkedliststack;

import java.util.Scanner;

/**
 *
 * @author Christian M. Abuda
 */
public class LinkedListStack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Enter the Stack Capacity! ");
        int limit = input.nextInt();
        
        
        Stack stack = new Stack(limit);
    }
}
class Node{
    int number;
    Node next;
    Node prev;
    
    
    public Node(int number){
        this.number = number;
        this.next = null;
        this.prev = null;
    }
}
class Stack{
    int limit;
    Node head;
    Node tail;
    
    public Stack(int limit){
        this.limit = limit;
    }
    
    public void push(int number){
        Node newNode = new Node(number);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = tail.next;
        }
    }
    public void pop(){
        if(tail == null){
            System.out.println("There is no value inside the Stack! ");
        }else{
            Node temp;
            tail.prev = head;
            System.out.println();
        }
    }
}
