package recursionimplementation;

/**
 *
 * @author Christian M. Abuda
 */
public class RecursionImplementation {
    public static void main(String[] args) {
        
        walk(5);
    }
    private static int walk(int steps){
        
        if(steps < 1) return;
        System.out.println("You Take a Steps");
        walk(steps -1 );
    }
}
