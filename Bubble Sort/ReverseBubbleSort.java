package reversebubblesortimplementation;

/**
 *
 * @author Christin M. Abuda
 */
public class ReverseBubbleSortImplementation {
    public static void main(String[] args) {
        int [] array = {9,1,2,5,6,8,7};
        
        reverseBubbleSort(array);
        
        System.out.print("This is Reverse Bubble Sort: ");
        for(int i: array){
            System.out.print(i + " ");
        }
        System.out.println("\n\n");
        
    }
    private static void reverseBubbleSort(int [] array){
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] < array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }  
            }
        }  
    }
}
