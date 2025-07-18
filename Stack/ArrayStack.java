package stackimplementation;

import java.util.Scanner;

/**
 *
 * @author Christian M. Abuda
 */
public class StackImplementation {
    public static void main(String[] args) {
       Scanner userInput = new Scanner(System.in);
       int choose;
        
       //Asking User for the Capacity of the Stack//
       System.out.println("Enter the Stack Capacity: ");
       int limit = userInput.nextInt();
        
        
       //Create an Object Stack//
       Stack stack = new Stack(limit);
       
               
       do{ 
        System.out.println("Please Choose the following:"
                    + "\n Press [1] to Add number on Stack"
                    + "\n Press [2] to Remove number on Stack"
                    + "\n Press [3] to Peek the Top number on Stack"
                    + "\n Press [4] to Know if the Stack is Full"
                    + "\n Press [5] to Know is the Stack is Empty"
                    + "\n Press [6] tp Exit the Program");
        choose = userInput.nextInt();
        
        
            if(choose > 0 && choose < 7){
                switch(choose){
                    case 1:{
                        System.out.println("Please Enter The Number to Insert on the Stack: ");
                        int number = userInput.nextInt();                    
                        stack.push(number);
                        break;
                    }
                    case 2:{
                        stack.pop();
                        break;
                    }
                    case 3:{
                        stack.peek();
                        break;
                    }
                    case 4:{
                        if(stack.isFull() == true){
                            System.out.println("Stack is Full! Cannot add another Number");
                        }else{
                            System.out.println("The Stack is NOT FULL!");
                        }
                        break;
                    }
                    case 5:{
                         if(stack.isEmpty() == true){
                             System.out.println("Stack is Empty!");
                         }else{
                             System.out.println("The Stack is not Empty! The size of Stack is: " + stack.getSize());
                         }
                         break;
                    }
                }    
            }else{
                System.out.println("Invalid Input! Please Try Again...");
            }
        }
        while(choose != 6);
        }
    }
class Stack{
    int size;
    int top;
    int [] arrayStack;
    int limit;
    
    public Stack(int limit){
    this.limit = limit;
    int [] arrayStack = {limit};
    this.arrayStack = new int[limit];
    this.top = top-1;
    this.size = arrayStack;
}
    public void push(int number){
        if(isFull()){
            System.out.println("The Stack is Full! Cannot add another Number ");
        }else{
            top++;
            arrayStack[top] = number;
            System.out.println("The number: [" + number + "]"
                    + " has Successfully Added to Stack!");
        }
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("The Stack is Empty!");
        }else{
            System.out.println("The number: [" + arrayStack[top] + "]"
                    + " has Successfully Pop to the Stack");
            top--;
        }
    }
    public void peek(){
        System.out.println("The Peek of the Stack is: " + arrayStack[top]);
    }
    public boolean isFull(){
        return top == limit-1;     
    }
    public boolean isEmpty(){
        return top == top-1;
    }
    public int getSize(){
        return size;
    }
}
