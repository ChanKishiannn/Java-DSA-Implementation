package linkedlist;

import java.util.Scanner;

/**
 *
 * @author Christian M. Abuda
 */
public class LinkedList {
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
        Scanner input = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        
        int userChoose;
        
        do{
            menu();
            userChoose = input.nextInt();
            
            if(userChoose > 0 && userChoose < 7){
                switch(userChoose){
                    case 1:{
                        System.out.print("\nEnter the number you want to add on the list: ");
                        int num = input.nextInt();
                        list.offer(num);
                        break;
                    }
                    case 2:{
                        list.poll();
                        break;
                    }
                    case 3:{
                        list.display();
                        break;
                    }
                    case 4:{
                        System.out.print("\nEnter where to you want to place the number on the list: ");
                        int nodePosition = input.nextInt();
                        System.out.print("\n Enter the number you want to add on the list: ");
                        int num = input.nextInt();
                        list.addNum(nodePosition, num);
                        break;
                    }
                    case 5:{
                        if(list.isEmpty() == true){
                            System.out.println("The list is empty!");
                        }else{
                            System.out.println("The list is not empty!");
                        }
                    }
                }
            }else{
                System.out.print("\nInvalid Input! Please try again: ");
            }
        }while(userChoose != 6);
        System.out.println("Exiting... Thank you!");
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
            System.out.print("\nThe number on the Node is: ");
            while(currentNode != null){
                System.out.print(currentNode.num + " ");
                currentNode = currentNode.next;
            }
            System.out.println();
        }
    } 
    public void addNum(int newNodePosition, int num){
        if(newNodePosition < 0 || newNodePosition > nodeCount){
            System.out.println("Invalid adding new number in the list! ");
            return;
        }
        Node newNode = new Node(num);
        
            if(newNodePosition == 0){
                newNode.next = head;
                head = newNode;
                if(tail == null){
                    tail = newNode;
                }
            }else{
                Node current = head;  
                for(int i = 0; i < newNodePosition -1; i++){
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode; 
            }
            if(newNode.next == null){
               tail = newNode;
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
