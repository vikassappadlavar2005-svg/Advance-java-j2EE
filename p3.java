package basics;

import java.util.ArrayList;
import java.util.Collections;

public class p3 {
    public static void main(String[] args) {

        // Creating ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Adding colors
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Black");

        // Display before sorting
        System.out.println("Before Sorting: " + colors);

        // Sorting using Collections.sort()
        Collections.sort(colors);

        // Display after sorting
        System.out.println("After Sorting: " + colors);
    }
}