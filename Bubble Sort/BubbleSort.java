package bubblesortimplementation;

/**
 *
 * @author Christin M. Abuda
 */
public class BubbleSortImplementation {
    public static void main(String[] args) {
        int [] array = {9,1,2,5,6,8,7};
        //9
        bubbleSort(array);
        
    }
    private static void bubbleSort(int [] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; array[j] > array[i + 1]; j++){
                int temp = array[j + 1];
                array[j + 1] = array[j];
                array[j] = temp;
                
                
            }
            System.out.print(array[i] + " ");
        }  
    }
}
