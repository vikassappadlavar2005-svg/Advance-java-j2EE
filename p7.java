package basics;

import java.util.LinkedList;
import java.util.Iterator;

public class p7 {
    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Blue");
        list.add("Green");
        list.add("Yellow");
        list.add("Red");
        list.add("Black");

        // Display original list
        System.out.println("Original List: " + list);

        // Using descendingIterator for reverse order
        Iterator<String> itr = list.descendingIterator();

        // Iterating in reverse
        System.out.println("Elements in Reverse Order:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}