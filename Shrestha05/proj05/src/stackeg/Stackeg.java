//Implement a program that reads a list of Integer numbers from the scan input 
//and saves them into a Stack sorted from the smallest to the largest:
//Use Collections Framework;
package stackeg;
import java.util.*;

/**
 *
 * @author nilee
 */

/**
 * This program reads a list of integers from the user, stores them in a stack,
 * and then sorts and prints the list in ascending order from the smallest to the largest.
 */

public class Stackeg {

    public static void main(String[] args) {
    /**
     * Creates a Scanner object to read user's input from the console.
     * Scanner sc = new Scanner(System.in):
     */
        Scanner sc = new Scanner(System.in);
    /**
     * Creates a stack to store the integer elements.
     * Stack<Integer> numstack = new Stack<>():
     */
        Stack<Integer> numstack = new Stack<>();
        // Read the number of elements from user input's.
        System.out.print("Enter the number of elements to be inserted: ");
        int n = sc.nextInt();
        // Prompt the user to enter the elements
       
        System.out.println("Enter the elements: ");
        try {
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                numstack.push(num);// store the elements in stack.
            }
            /**
             * Sort the stack from smallest to the largest in ascending order by using collection.sort.
             * Collections.sort();
             */
            
            Collections.sort(numstack);
            // Print the sorted list in ascending order
            System.out.println("Sorted stack from the smallest to the largest: ");
            while (!numstack.isEmpty()) {
                System.out.print(numstack.remove(0) + " ");
            }
        }
        /**
         * Handles InputMismatchException if input provided by the user is not an integer.
         * catch (InputMismatchException );
         */
        catch (InputMismatchException e) 
        {
            System.err.println("Invalid input! Please enter integers only.");
        } finally {
            sc.close(); // Close the scanner.
        }
    
    }
}

    
    

