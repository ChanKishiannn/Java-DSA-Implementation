package insertionsortimplementation;

/**
 *
 * @author Christin M. Abuda
 */
public class InsertionSortImplementation {
    public static void main(String[] args) {
        int [] array = {8,2,9,4,3,6,1};
        
        insertionSort(array);
        
        System.out.println("Insertion Sort: ");
            for(int i : array){
                System.out.print(i);
         }
        System.out.println("\n");
    }
    private static void insertionSort(int [] array){
        for(int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;
            
            while(j >= 0 && array[j] > temp){
                array[j + 1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }
    }
}
