package linearsearch;

import java.util.Scanner;

/**
 *
 * @author Christian M. Abuda
 */
public class LinearSearch {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       Object [] array = {2,6,4,5, "Chan"};
           
       System.out.print("Enter the Object you want to search: ");
       String search = input.next();
       
       int index = linearSearch(array, search);
       
       
       if(index != -1){
           System.out.println("Object [" + search + "] was on the array!");
       }else{
           System.out.println("Object [" + search + "] was NOT on the array!");
       }
    }
    private static int linearSearch(Object []array, Object value){
        if(value instanceof Integer){
            for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i; 
            }
        }
        return -1;
        }else{
            for(int i = 0; i < array.length; i++){
            if(array[i].equals(value)){
                return i; 
            }
        }
        return -1;
        }
    }
}
