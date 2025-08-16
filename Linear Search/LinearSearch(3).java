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
       
       Object index = linearSearch(array, search);
       
       if(index != false){
           System.out.println("Object [" + search + "] was NOT on the array!");
       }else{
           System.out.println("Object [" + search + "] was on the array!");
       }
    }
    private static Object linearSearch(Object []array, Object value){
        boolean found;
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){  
                return found = true;
            }
        }
        return found = false;
    }
}
class checker{
    boolean found;
    
    public checker(boolean found){
        this.found = found;
    }
}
