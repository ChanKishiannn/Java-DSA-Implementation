package bubblesortimplementation;
/**
 *
 * @author Christian M. Abuda
 */
public class BubbleSortImplementation {
    public static void main(String[] args) {
        int [] array = {8,7,1,9,5,10};
        
        bubbleSort(array);
        
        for(int i : array){
        System.out.print(i + " ");
        }
    }
    private static void bubbleSort(int [] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
   
    
