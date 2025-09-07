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
        for(int i = 0; i < arr.length; i++){
            int temp =  arr[i];
            int  j = i - 1;
            
            while(j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}
