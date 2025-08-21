package bubblesortimplementation;

/**
 *
 * @author Christin M. Abuda
 */
public class BubbleSortImplementation {
    public static void main(String[] args) {
        int [] array = {9,1,2,5,6,8,7};
        
        bubbleSort(array);
        
    }
    private static void bubbleSort(int [] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; array[i] < array[j]; ++j){
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;           
            }
        }  
    }
}
