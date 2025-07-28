package linkedliststack;

import java.util.Scanner;

/**
 *
 * @author Christian M. Abuda
 */
public class LinkedListStack {  
    
    
    public static void questionier(){
        System.out.println("Please Choose the Following"
                   + "\n Press [1] to Add number on Stack"
                   + "\n Press [2] to Remove number on Stack"
                   + "\n Press [3] to Peek the Top number on Stack"
                   + "\n Press [4] to Know if the Stack is Full"
                   + "\n Press [5] to Know is the Stack is Empty"
                   + "\n Press [6] to Know the Size of the Stack"
                   + "\n Press [7] to Exit the Program");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userChoose;
        
        System.out.println("Please Enter the Stack Capacity! ");
        int limit = input.nextInt();
        
        
        Stack stack = new Stack(limit);
        
        do{
          questionier();
          userChoose = input.nextInt();
          
          if(userChoose > 0 && userChoose < 8){
                switch(userChoose){
                    case 1:{
                        //Inserting an Number in the Stack
                        System.out.println("Please Enter The Number to Insert on the Stack: ");
                        int number = input.nextInt();                    
                        stack.push(number);
                        break;
                    }
                    case 2:{
                        //Removing an Number from the Stack
                        stack.pop();
                        break;
                    }
                    case 3:{
                        //View the Top Number from the Stack
                        stack.peek();
                        break;
                    }
                    case 4:{
                        //Checking if the Stack is Full or not
                        if(stack.isFull() == true){
                            System.out.println("Stack is Full! Cannot add another Number");
                        }else{
                            System.out.println("The Stack is NOT FULL!");
                        }
                        break;
                    }
                    case 5:{
                        //Checking if the Stack is Empty or not
                         if(stack.isEmpty() == true){
                             System.out.println("Stack is Empty!");
                         }else{
                             System.out.println("The Stack is not Empty!");
                         }
                         break;
                    }
                    case 6:{
                        stack.size();
                    }
                }    
            }else{
                //Error message if the user input deffirent Number
                System.out.println("Invalid Input! Please Try Again...");
            }
        }
       //The programs will be continue to loop if the user does not choose 6
        while(userChoose != 7);
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
    
    private int size = 0;
    
    public Stack(int limit){
        this.limit = limit;
    }
    
    public void push(int number){
        Node newNode = new Node(number);
        size++;
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = tail.next;
        }
    }
    public void pop(){
        size--;
        if(tail == null){
            System.out.println("There is no value inside the Stack! ");
        }else{
            Node temp;
            tail.prev = head;
            System.out.println();
        }
    }
    public boolean isFull(){
        if(size == limit){
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }else{
            return false;
        }
    }
    public void size(){
        System.out.println(size);
    }
    public void peek(){
        Node temp;
        
        temp = tail;
        
        System.out.println(temp);
    }
}

