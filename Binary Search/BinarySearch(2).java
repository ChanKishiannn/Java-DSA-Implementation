package binarysearch;
/**
 *
 * @author Christian M. Abuda
 */
public class BinarySearch {
    public static void main(String[] args) {
        
        int [] array = new int[100];
        int target = 99;
        
        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }
        
        int index = binarySearch(array, target);
        
        if(index < 0){
            System.out.println("The value [" + target + "] was NOT FOUND!");
        }else{
            System.out.println("The value [" + target + "] was FOUND!");
        }
    }
    private static int binarySearch(int [] array, int target){
        for(int i = 0; i < array.length; i++){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }
    
}
