package basics;

import java.util.ArrayList;
import java.util.List;

public class p4 {
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

        // Extracting 1st and 2nd elements using subList()
        List<String> subList = colors.subList(0, 2);

        // Display extracted elements
        System.out.println("Extracted Elements (1st & 2nd): " + subList);
    }
}