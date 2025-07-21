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
        //Asking A Option for user to choose//
        System.out.println("Please Choose the following:"
                    + "\n Press [1] to Add number on Stack"
                    + "\n Press [2] to Remove number on Stack"
                    + "\n Press [3] to Peek the Top number on Stack"
                    + "\n Press [4] to Know if the Stack is Full"
                    + "\n Press [5] to Know is the Stack is Empty"
                    + "\n Press [6] tp Exit the Program");
        choose = userInput.nextInt();
        
        //This Code allow program to execute based on the user input
            if(choose > 0 && choose < 7){
                switch(choose){
                    case 1:{
                        //Inserting an Number in the Stack
                        System.out.println("Please Enter The Number to Insert on the Stack: ");
                        int number = userInput.nextInt();                    
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
                }    
            }else{
                //Error message if the user input deffirent Number
                System.out.println("Invalid Input! Please Try Again...");
            }
        }
       //The programs will be continue to loop if the user does not choose 6
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
    this.arrayStack = new int[limit];
    this.top = -1;
}
    //Creating a Push Method to insert the number on Stack
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
    //Creating a Pop Method to remove the number on Stack
    public void pop(){
        if(isEmpty()){
            System.out.println("The Stack is Empty!");
        }else{
            System.out.println("The number: [" + arrayStack[top] + "]"
                    + " has Successfully Pop to the Stack");
            top--;
        }
    }
    //Creating a Peek Method to view the top number on Stack
    public void peek(){
        System.out.println("The Peek of the Stack is: " + arrayStack[top]);
    }
    //Creating a isFull Method to check if the Stack is Full
    public boolean isFull(){
        return top == limit-1;     
    }
    //Creating a isEmpty Method to check if the Stack is Empty
    public boolean isEmpty(){
        return top == -1;
    }
}
