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
    int size = 0;
    int capacity;
    Object [] array;
    
    public DynamicArray(int capacity){
        this.capacity = capacity;
        this.array = new Object [capacity];
    }
    
    public void add(Object data){
        if(size >= capacity){
            grow();
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
            shrink();
        }
    }
    public void grow(){
        capacity = capacity * 2;
        
        Object [] newArray = new Object[capacity];
        
        for(int i = 0; i < size; i++){
           newArray[i] = array[i];
        }
        
        array = newArray;
    }
    public void shrink(){
        if(size <= capacity / 2 && capacity > 1){
            capacity = Math.max(1, capacity /2);
            
            Object [] newArray = new Object[capacity];
        
            for(int i = 0; i < size; i++){
            newArray[i] = array[i];
            }
            
        array = newArray;
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
}
