package basics;

import java.util.Arrays;

public class StringOperationsDemo {
    public static void main(String[] args) {

        // 1. Creation
        String s1 = "Hello";
        String s2 = "World";

        // 2. Length & Character
        System.out.println("Length: " + s1.length());
        System.out.println("Char at 1: " + s1.charAt(1));

        // 3. Comparison
        System.out.println("Equals: " + s1.equals("hello"));
        System.out.println("Ignore case: " + s1.equalsIgnoreCase("hello"));

        // 4. Searching
        String s3 = "Hello World";
        System.out.println("Index: " + s3.indexOf("World"));
        System.out.println("Contains: " + s3.contains("Hello"));

        // 5. Substring
        System.out.println("Substring: " + s3.substring(0, 5));

        // 6. Modification
        String s4 = "Java Programming";
        System.out.println(s4.toUpperCase());
        System.out.println(s4.replace("Java", "Python"));

        // 7. Trim
        String s5 = "   Java   ";
        System.out.println("Trim: '" + s5.trim() + "'");

        // 8. Concatenation
        System.out.println("Concat: " + s1 + " " + s2);

        // 9. Split
        String[] arr = "Apple,Banana,Orange".split(",");
        System.out.println(Arrays.toString(arr));

        // 10. StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        System.out.println(sb);

        // 11. Formatting
        System.out.println(String.format("Age: %d", 20));

        // 12. Email Validation
        String email = "example@gmail.com";
        if (email.contains("@") && email.startsWith("example") && email.endsWith(".com"))
            System.out.println("Valid Email");
        else
            System.out.println("Invalid Email");
    }
}