package quicksortimplementation;

/**
 *
 * @author Christian M. Abuda
 */
public class QuickSortImplementation {
    public static void main(String[] args) {
        int [] array = {8,3,1,8,6,10};
        
        quickSort(array, 0, array.length - 1);
        
        for(int i : array){
            System.out.print(i + " ");
        }
    }
    private static void quickSort(int [] array, int start, int end){
        if(end <= start){ 
            return;
        }
            
    }
    
}
