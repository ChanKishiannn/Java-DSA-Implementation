package dynamicarrayimplementaion;

import java.util.Scanner;

/**
 *
 * @author Christian M. Abuda
 */
public class DynamicArrayImplementaion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the limit of the Array: ");
        int capacity = input.nextInt();
        
        DynamicArray array = new DynamicArray(capacity);
    }
    
}
class DynamicArray{
    int currentIndex = 0;
    int capacity;
    int [] array;
    
    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new int [capacity];
    }
    
    public void add(int num){
        currentIndex++;
        
        if(isFull() == false){
            array[currentIndex] = num;
        }else{
            array = new int[capacity * 2];
             array[currentIndex] = num;
        }
    }
    public boolean isFull(){
        if(currentIndex == capacity){
            return true;
        }else{
            return false;
        } 
    }
}
