//Implement a program that reads a list of Integer numbers from the scanned input 
//and saves them into a Linked List sorted from the smallest to the largest.
package linkedlist;
import java.util.*;

/**
 *
 * @author nilee
 */

/**
 * This program reads a list of integers from the user, stores them in a linked list,
 * and then sorts and prints the list in ascending order from the smallest to the largest.
 */

public class Linkedlist {
    /**
     * @param args Command-line arguments.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         // LinkedList is used to store elements.
        LinkedList<Integer> list = new LinkedList<>(); 
        // Read the number of elements from user input's.
        System.out.print("Enter the number of elements to be Inserted: ");
        int n = sc.nextInt();
        // Prompt the user to enter the elements
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            // Read each element from user's input
            int num = sc.nextInt();
            // Add the element to the linked list
            list.add(num);
        }
        // Sort the linked list from the smallest to the largest 
        Collections.sort(list);
        // Print the sorted list in ascending order
        System.out.println("Sorted list from the smallest to the largest: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
