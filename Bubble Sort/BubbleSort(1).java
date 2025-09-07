package bubblesortimplementation;

/**
 *
 * @author Christian M. Abuda
 */
public class BubbleSortImplementation {
    public static void main(String[] args){
       int [] array = {8,4,6,9,2,1};
       
       bubbleSort(array);
      
       System.out.print("Bubble Sort: ");
       for(int i : array){
           System.out.print(i);
       }
       System.out.println("\n");
    }
    public static void bubbleSort(int [] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i -1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
