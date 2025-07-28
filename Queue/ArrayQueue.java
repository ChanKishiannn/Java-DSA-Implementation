package arrayqueue;

import java.util.Scanner;

/**
 *
 * @author Christian M. Abuda
 */
public class ArrayQueue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Enter the Queue Capacity: ");
        int capacity = input.nextInt();
        
        Queue queue = new Queue(capacity);
    }   
}
class Queue{
    int capacity;
    int numArray;
    int [] array;
    
    public Queue(int capacity){
        this.numArray = -1;
        this.capacity = capacity;
        this.array = new int [capacity];
    }
    
    public void offer(int number){
        if(isFull()){
            System.out.println("The Queue is Full!");
        }else{
            numArray++;
            array[numArray] = number;
            System.out.println("The number [" + number + "] was "
                    + "Successfully added to the Queue");
        }
    }
    public void poll(){
        if(isEmpty()){
            System.out.println("The Queue is Empty!");
        }else{
            System.out.println("The number [" + numArray + "] was "
                    + "Successfully deleted to the Queue");
            numArray--;
        }
    }
    public boolean isFull(){
        if(numArray == capacity){
            return true;
        }else{
            return false;
        }
    }
    public boolean isEmpty(){
        if(capacity == -1){
            return true;
        }else{
            return false;
        }
    }
}
