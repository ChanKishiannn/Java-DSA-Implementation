package arrayqueue;

import java.util.Scanner;

/**
 *
 * @author Christian M. Abuda
 */
public class ArrayQueue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //Asking the what is the full capacity of the Queue
        System.out.println("Please Enter the Queue Capacity: ");
        int capacity = input.nextInt();
        
        /*Making an Object called Queue and named it queue 
        and place the capacity inside the object Queue */
        Queue queue = new Queue(capacity);
        
        
        //Asking the user what input should we put to run the program
        System.out.println("Enter what command you want to run in the system"
                + "\n 1. Add Number in to Queue"
                + "\n 2. Delete the First Number in Queue"
                + "\n 3. Check if the Queue is Full"
                + "\n 4. Check if the Queue is Empty"
                + "\n 5. To Exit the Program");
        
        
        /*Making a do while loop to loop the program
        until the user input the specific command to exit the program */
        int userInput;
        do{
            //Getting the user input
            System.out.println("\nEnter your Choice");
            userInput = input.nextInt();
            
            //Checking if the user input is based on the Question
            if(userInput <= 5 && userInput >= 1){
                switch(userInput){
                    case 1:{
                        /*if the user input 1 it run this program where it stored the
                        user number in the queue
                        */
                        System.out.println("Please Enter your Number: ");
                        int num = input.nextInt();
                        
                        queue.offer(num);
                        break;
                    }
                    case 2:{
                        /*if the user input 2 it run this program where it delete the
                        first number of the user in the queue
                        */
                        queue.poll();
                        break;
                    }
                    case 3:{
                        /*if the user input 3 it run this program where it check the
                        if the queue is full
                        */
                        if(queue.isFull()){
                            System.out.println("The Queue is Full!");
                        }else{
                            System.out.println("The Queue is not Full!");
                        }
                        break;
                    }
                    case 4:{
                        /*if the user input 3 it run this program where it check the
                        if the queue is empty
                        */
                        if(queue.isEmpty()){
                            System.out.println("The Queue is Empty!");
                        }else{
                            System.out.println("The Queue is not Empty!");
                        }
                        break;
                    }
                }
            }
            //Displaying an Error message if the user input less than 1 and greater than 5
            else{
                System.out.println("Invalid Number! Just Choose from 1 to 5");
            }
        }
        //Code wher is loops the program until the user input the number 5
        while(userInput != 5);
        System.out.println("Exiting... Thank You!");
        }
    }   
//Queue class that implements a basic array-based queue
class Queue{
    int capacity;
    int rearArray;
    int [] array;
    
    //Constructor that sets the capacity and initializes the array
    public Queue(int capacity){
        this.rearArray = -1;
        this.capacity = capacity;
        this.array = new int [capacity];
    }
    
    //Making a offer method to stored the user number in to the Queue
    public void offer(int number){
        if(isFull()){
            System.out.println("The Queue is Full!");
        }else{
            rearArray++;
            array[rearArray] = number;
            System.out.println("The number [" + number + "] was "
                    + "Successfully added to the Queue");
        }
    }
    //Making a poll method to delete the user first number in the Queue
    public void poll(){
        if(isEmpty()){
            System.out.println("The Queue is Empty!");
        }else{
            int arrayHead;
            
            arrayHead = array[0];
            System.out.println("The number [" + arrayHead + "] was "
                    + "Successfully deleted to the Queue");
            
            for(int i = 0; i < rearArray; i++){
                array[i] = array[i + 1];
            }
            rearArray--;
        }
    }
    //Making a isFull method to check the Queue if it is full
    public boolean isFull(){
        if(rearArray == capacity -1){
            return true;
        }else{
            return false;
        }
    }
    //Making a isFull method to check the Queue if it is empty
    public boolean isEmpty(){
        if(rearArray == -1){
            return true;
        }else{
            return false;
        }
    }
}
