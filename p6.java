package basics;

import java.util.LinkedList;
import java.util.Iterator;

public class p6 {
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
        System.out.println("LinkedList: " + list);

        // Creating iterator starting from 2nd position (index 1)
        Iterator<String> itr = list.listIterator(1);

        // Iterating from 2nd element
        System.out.println("Elements from 2nd position:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}