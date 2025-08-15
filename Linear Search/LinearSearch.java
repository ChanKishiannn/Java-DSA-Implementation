package linearsearch;

import java.util.Scanner;

/**
 *
 * @author Christian M. Abuda
 */
public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int [] array = {9,5,7,2,4,8};
        
        System.out.println("Enter the number you want to search: ");
        int search = input.nextInt();
        
        
        boolean found = false;
        for(int i = 0; i < array.length; i++){
            if(array[i] == search){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("The number [" + search + "] was on the array!");
        }else{
            System.out.println("The number [" + search + "] was not in the array");
        }
        
    }
    
}
