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
                        //Getting the size of the Stack
                        stack.getSize();
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
//creating a class named node
class Node{
    int number;
    Node next;
    
    
    public Node(int number){
        this.number = number;
        this.next = null;
    }
}
// creating a class named stack
class Stack{
    private int limit;
    private Node head;
    private int size = 0;
    
    public Stack(int limit){
        this.limit = limit;
    }
    //creating a push method on stack
    public void push(int number){
        if(isFull()){
            System.out.println("The Stack is Full! ");
        }else{
            Node newNode = new Node(number);
            newNode.next = head;
            head = newNode;
            size++;
            System.out.println("The " + number + " was successfully added to the Stack");
        }
    }
    //creating a pop method on stack
    public void pop(){
        if(isEmpty()){
            System.out.println("The Stack is Empty!");;
            
        }else{
            System.out.println("Removing the Top Element: " + head.number);
            head = head.next;
            size--;
        }
    }
    //creating a method to checking if the stack is full
    public boolean isFull(){
        if(size == limit){
            return true;
        }else{
            return false;
        }
    }
     //creating a method to checking if the stack is empty
    public boolean isEmpty(){
       if(size == 0){
           return true;
       }else{
           return false;
       }
    }
     //creating a method to checking the size of the stack
    public void getSize(){
       System.out.println(size);
    }
     //creating a method to checking the top of the stack
    public void peek(){
       if (isEmpty()) {
            System.out.println("Stack is empty. No top element.");
        } else {
            System.out.println("Top element is: " + head.number);
        }
    }
}

