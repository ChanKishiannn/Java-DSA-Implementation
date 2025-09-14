package watertank_stack_implementation;

import java.util.Scanner;

/**
 *
 * @author Christian M. Abuda
 */
public class WaterTank_Stack_Implementation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tankLimit;
        
        System.out.println("Enter how many Water to put!: ");
        tankLimit = input.nextInt();
        
        
        Watertank tank = new Watertank(tankLimit);
    }
    
}
class Watertank{
    int limit;
    int top;
    int [] arrayTank;
    int size;
    
    public Watertank(int tankLimit){
        this.limit = tankLimit;
        this.arrayTank = new int [tankLimit];
        this.top = -1;
    }
    public void addWater(int addwater){
        if(isFull()){
            System.out.println("The Water is OverFlowing! ");
        }else{
            top++;
            arrayTank[top] = addwater;
        }
    }
    public void removeWater(){
        if(isEmpty()){
            System.out.println("The Water is UnderFlowing! ");
        }else{
            top--;
        }
    }
    public int getSize(){
        return top + 1;
    }
    public boolean isFull(){
        return top == limit-1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
}
