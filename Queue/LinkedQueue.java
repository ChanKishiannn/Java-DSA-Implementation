package linkedqueue;

import java.util.Scanner;

/**
 *
 * @author Christian M. Abuda
 */
public class LinkedQueue {
    public static void printMenu(){
         System.out.println("Enter what command you want to run in the system"
            + "\n 1. Add Number in to Queue"
            + "\n 2. Delete the First Number in Queue"
            + "\n 3. Check if the First Queue"
            + "\n 4. Display all Queue number"
            + "\n 5. Check if the Queue is Empty"
            + "\n 6. To Exit the Program");
        
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedListQueue queue = new LinkedListQueue();
        
        int userInput;
        do{
            printMenu();
            userInput = input.nextInt();
            
            if(userInput > 0 && userInput < 7){
                switch(userInput){
                    case 1:{
                        System.out.print("\nPlease Input the Number to Add in the Queue: ");
                        int num = input.nextInt();
                        queue.offer(num);
                        break;
                    }
                    case 2:{
                        queue.poll();
                        break;
                    }
                    case 3:{
                        queue.peek();
                        break;
                    }
                    case 4:{
                        System.out.println("The Queue Values are : ");
                        queue.display();
                        break;
                    }
                    case 5:{
                        if(queue.isEmpty() == true){
                            System.out.println("The Queue is Empty!");
                        }else{
                            System.out.println("The Queue is Not Empty");
                        }
                        break;
                    }
                }
            }else{
                System.out.print("\nThe number you Enter is Invalid! Please try again: ");
            }
            
        }while(userInput != 6);     
    }    
}
class Node{
    int num;
    Node next;
    
    public Node(int number){
        this.num = number;
        this.next = null;
    }
}
class LinkedListQueue{
    Node head;
    Node tail;
    
    private int nodeCount = 0;
    
    public void offer(int num){
        Node newNode = new Node(num);
        if(head == null){
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
            System.out.println("The Queue is Empty!");
        }else{
            System.out.println("The Number ["+ head + "] was Deleted");
            head = head.next;
            nodeCount--;
        }
        
        if(head == null){
            tail = null;
        }
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("The Queue is Empty");
        }else{
            Node temp;
            temp = head;
            
            System.out.println("The First value of the Queue is [" + temp.num + "]");
        }
    }
    public void display(){
        if(isEmpty()){
            System.out.println("The Queue is Empty!");
        }else{
            Node current = head;
            
            while(current != null){
                System.out.print(current.num + " ");
                current = current.next;
            }
        }
        System.out.println();
    }
    public boolean isEmpty(){
        if(nodeCount == 0){
            return true;
        }else{
            return false;
        }
    }
}
