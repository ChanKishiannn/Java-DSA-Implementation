package linearsearch;

import java.util.Scanner;

/**
 * Example implementation of Linear Search.
 * 
 * This program demonstrates the basic logic of Linear Search by checking
 * whether a user-provided number exists in a fixed array.
 * 
 * @author Christian M. Abuda
 */
public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Initialize an array with predefined values
        int[] array = {9, 5, 7, 2, 4, 8};

        // Prompt the user for input
        System.out.print("Enter the number you want to search: ");
        int search = input.nextInt();

        // Perform a linear search to check if the number exists in the array
        boolean found = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                found = true;
                break;
            }
        }

        // Display the result
        if (found) {
            System.out.println("The number [" + search + "] was found in the array.");
        } else {
            System.out.println("The number [" + search + "] was not found in the array.");
        }
    }
}
