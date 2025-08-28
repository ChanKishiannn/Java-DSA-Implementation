package mergesortimplementastion;
/**
 *
 * @author Christian M. Abuda
 */
public class MergeSortImplementastion {
    public static void main(String[] args) {
        int [] array = {9,3,2,8,6,1,5};
        
        mergeSort(array);
        
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    private static void mergeSort(int [] array){
        int length = array.length;
        if(length <= 1) 
            return;
        
        int middle = length / 2;
        int [] leftArray = new int[middle];
        int [] rightArray = new int[length - middle];
        
        int i = 0;
        int j = 0;
        
        for(; i < length;  i++){
            if(i < middle){
                leftArray[i] = array[i];
            }
            else{
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }
    private static void merge(int [] leftArray, int [] rightArray, int [] array){
        
    }
}
