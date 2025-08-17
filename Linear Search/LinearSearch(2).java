package linearsearch;

import java.util.Scanner;

/**
 * A simple demonstration of the Linear Search algorithm.
 * 
 * The program prompts the user to enter a number and checks whether 
 * the number exists in a predefined integer array.
 * 
 * @author Christian M. Abuda
 */
public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner object for user input

        // Predefined array to search from
        int[] array = {2, 8, 9, 5};

        // Prompt user for the value to search
        System.out.print("Please Enter the value you want to check: ");
        int value = input.nextInt();

        // Call the linearSearch method to find the index of the value
        int index = linearSearch(array, value);

        // Display result based on whether the value was found
        if (index != -1) {
            System.out.println("There's a similar value found in the array!");
        } else {
            System.out.println("There's no similar value in the array!");
        }
    }

    /**
     * Performs a linear search on the given array.
     *
     * @param array the array to search through
     * @param value the value to search for
     * @return the index of the value if found, otherwise -1
     */
    private static int linearSearch(int[] array, int value) {
        // Iterate through the array to look for the value
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i; // return the index if the value is found
            }
        }
        // Return -1 if the value is not found
        return -1;
    }
}
