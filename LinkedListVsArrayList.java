package linkedlistvsarraylist;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Christian M. Abuda
 */
public class LInkedListVsArrayList {
    public static void main(String[] args) { 
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }
        long startTime;
        long endTime;
        long elapseTime;
            
        /* +++++++++++ LinkedList +++++++++++ */
        startTime = System.nanoTime();
        
        linkedList.get(100);
        endTime = System.nanoTime();
        
        elapseTime = endTime - startTime;  
        
        System.out.println("LinkedList: \t" + elapseTime + "ns");
        
        
        /* +++++++++++ ArrayList +++++++++++ */
        startTime = System.nanoTime();
        
        arrayList.get(100);
        endTime = System.nanoTime();
        
        elapseTime = endTime - startTime;  
        
        System.out.println("ArrayList: \t" + elapseTime + "ns");
    }
    
}
