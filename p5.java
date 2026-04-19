package basics;

import java.util.ArrayList;

public class p5 {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Black");

        // Display original list
        System.out.println("Original List: " + colors);

        // Removing nth element (example: 3rd element → index 2)
        int n = 2;  // index of element to remove
        colors.remove(n);

        // Display updated list
        System.out.println("After removing element at index " + n + ": " + colors);
    }
}