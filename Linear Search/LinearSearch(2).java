package linearsearch;

import java.util.Scanner;

/**
 *
 * @author Christian M. Abuda
 */
public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = {2,8,9,5};
        
        System.out.print("Please Enter the value you want to check: ");
        int value = input.nextInt();
        
        int index = linearSearch(array, value);
        
        if(index != -1){
            System.out.println("Theres a similar value found in the array!");
        }else{
            System.out.println("Theres no similar value in the array!");
        }
    }

    private static int linearSearch(int[] array, int value) {
        for(int i=0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
