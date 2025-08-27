package recursionimplementation;

/**
 *
 * @author Christian M. Abuda
 */
public class RecursionImplementation {
    public static void main(String[] args) {
        
        System.out.println(factorial(7));
    }
    private static int factorial(int num){
        
        if(num < 1) return 1;
        return num * factorial(num - 1);
    }
}
