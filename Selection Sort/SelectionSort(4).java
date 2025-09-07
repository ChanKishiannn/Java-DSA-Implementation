package insertionsort;

/**
 *
 * @author Christian
 */
public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {10,7,3,1,8};
        
        insertionSort(arr);
        
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    private static void insertionSort(int [] arr){
       for(int i = 0; i < arr.length - 1; i++){
           int min = i;
           
           for(int j = i + 1; j < arr.length; j++){
               if(arr[min] > arr[j]){
                   min = j;
               }
           }
           int temp = arr[i];
           arr[i] = arr[min];
           arr[min] = temp;
       }
    }
}
