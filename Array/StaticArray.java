package staticarrayimplementaion;

import java.util.Scanner;

/**
 *
 * @author Christian M. Abuda
 */
public class StaticArrayImplementaion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the limit of the Array: ");
        int capacity = input.nextInt();
        
        StaticArray array = new StaticArray(capacity);
        
    }
    
}
class StaticArray{
    int size = 0;
    int capacity;
    Object [] array;
    
    public StaticArray(int capacity){
        this.capacity = capacity;
        this.array = new Object [capacity];
    }
    
    public void add(Object data){
        if(isFull()){
            System.out.println("The Array is Full!");
        }
        array[size] = data;
        size++;
    }
    public void delete(){
        if(isEmpty()){
            System.out.println("The Array is Empty!");
        }else{
            for(int i = 0; i < size - 1; i++){
                array[i] = array[i + 1];
            }
            array[size - 1] = null;
            size--;
        }
    }
    public String toString(){
        
        String string  = "";
        
        for(int i = 0; i < size; i++){
            string += array[i] + ", ";
        }
        if(!string.isEmpty()){
            string = string.substring(0, string.length() - 2);
        }
        return string;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == capacity;
    }
}

