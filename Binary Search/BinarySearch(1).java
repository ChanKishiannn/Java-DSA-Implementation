package binarysearch;

import java.util.Arrays;

/**
 *
 * @author Christian M. Abuda
 */
public class BinarySearch {
    public static void main(String[] args) {
        
        int [] array = new int[100];
        int target = 900;
        
        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }
        
        int index = Arrays.binarySearch(array, target);
        
        if(index == -1){
            System.out.println("The value [" + target + "] was NOT FOUND!");
        }else{
            System.out.println("The value [" + target + "] was FOUND!");
        }
    }
    
}
