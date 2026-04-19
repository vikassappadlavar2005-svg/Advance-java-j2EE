package basics;

import java.util.LinkedList;
import java.util.Collections;

public class p10 {
    public static void main(String[] args) {

        // Creating LinkedList
        LinkedList<String> l_list = new LinkedList<>();

        // Adding elements
        l_list.add("Blue");
        l_list.add("Green");
        l_list.add("Yellow");
        l_list.add("Red");
        l_list.add("Black");

        // Display original list
        System.out.println("Before Swapping: " + l_list);

        // Swapping 1st and 3rd elements (index 0 and 2)
        Collections.swap(l_list, 0, 2);

        // Display updated list
        System.out.println("After Swapping: " + l_list);
    }
}