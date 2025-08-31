package hashtableimplementation;
import java.util.Hashtable;

/**
 *
 * @author Christian M. Abuda
 */
public class HashTableImplementation {
    public static void main(String[] args) {
        
        Hashtable<Integer, String> table = new Hashtable<>(10);
        
        table.put(100, "Eren Yieger");
        table.put(123, "Midoriya Izuko");
        table.put(321, "Karegaya Kazuto");
        table.put(555, "Jack The Reiper");
        table.put(777, "Chan Key");
        
        
        System.out.println(table.get(100));
    }
    
}
