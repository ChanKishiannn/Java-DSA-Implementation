package selectionsortimplementation;
/**
 *
 * @author Christin M. Abuda
 */
public class SelectionSortImplementation {
    public static void main(String[] args) {
        int [] array = {9,1,2,5,6,8,7};
        
        
        selectionSort(array);
        
        System.out.print("This is Selection Sort: ");
        for(int i: array){
            System.out.print(i + " ");
        }
    }
    private static void selectionSort(int [] array){
        for(int i = 0; i < array.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                    
                }  
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }  
    }
}
