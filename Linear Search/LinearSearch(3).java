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
       
       boolean found = linearSearch(array, search);
       
       if(found){
           System.out.println("Object [" + search + "] was on the array!");
       }else{
           System.out.println("Object [" + search + "] was NOT on the array!");
       }
    }
    private static boolean linearSearch(Object[] array, Object value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof Integer) {
                String convert = String.valueOf(array[i]);
                
                if (convert.equals(value))
                    return true;
            }
            if (array[i].equals(value))
                    return true;
        }
        return false;
    }
}
