import java.util.*;

/**
 * Class SortedList takes an integer from the command line and adds it to a Stack.
 * The list is sorted and printed out to the console.  The class is updated from version
 * 1.0 where a LinkedList was used.
 * <p>
 * @author Rob Sand
 * @version 1.1
 * @since CSC6301 Week 5
 * 
 */

public class SortedList {
    /**
     * Main Method of the class. The main method will continue
     * to request integers to be added to the LinkedList in a Stack, 
     * until a non-integer is entered into the command line.
     * Updated from version 1.0 which used a LinkedList.
     * 
     * @param args default parameter for main - not used
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<Integer> list = new Stack<>();

        do {
            System.out.println("Please enter an integer:");

            int next = scanner.nextInt();
            
            addSort(next, list);
            System.out.println(list);

        } while (scanner.hasNextInt());

        scanner.close();

    }

    /**
     * Method which adds an integer to the Stack. Updated from version 1.0 where
     * a LinkedList was used.
     * 
     * 
     * @param next Integer from scanner to be added to the List. In version 1.0 the add method is used
     * in Version 1.1 the push method is used.
     * @param list The List which the integer is added into.
     */
    public static void addSort(int next, Stack<Integer> list) {
        list.push(next);
        Collections.sort(list);

    }
}
