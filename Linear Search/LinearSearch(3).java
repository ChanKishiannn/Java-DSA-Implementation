package linearsearch;

import java.util.Scanner;

/**
 *
 * @author Christian M. Abuda
 */
public class LinearSearch {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       Object [] array = {2,6,4,5};
           
       System.out.print("Enter the Object you want to search: ");
       Object search = input.next();
       
        
       int index = linearSearch(array, 2);
       
       
       
       if(index != -1){
           System.out.println("Number was on the array!");
       }else{
           System.out.println("Number was not on the array!");
       }
    }
    
    private static int linearSearch(Object []array,Object value){
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
