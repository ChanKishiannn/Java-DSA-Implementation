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
       Object search = input.next();
       
        
       Object index = linearSearch(array, search);
       
       
       if(index != false){
           System.out.println("Number was on the array!");
       }else{
           System.out.println("Number was not on the array!");
       }
    }
    private static int linearSearch(Object []array,Object value){
        int checker = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return checker = i;
                
            }
        }
        if(checker != -1){
            return bool == true;
        }
        return -1;
    }
}
