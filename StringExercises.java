package basics;

import java.util.Random;

public class StringExercises {

    // Q1
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    // Q2
    public static int countOccurrences(String main, String sub) {
        int count = 0, index = 0;
        while ((index = main.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    // Q3
    public static String reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
            rev += str.charAt(i);
        return rev;
    }

    // Q4
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++; j--;
        }
        return true;
    }

    // Q5
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

    // Q6
    public static String capitalizeWords(String str) {
        String[] words = str.split(" ");
        String res = "";
        for (String w : words) {
            if (w.length() > 0)
                res += w.substring(0,1).toUpperCase() + w.substring(1).toLowerCase() + " ";
        }
        return res.trim();
    }

    // Q7
    public static String truncate(String str, int len) {
        return (str.length() <= len) ? str : str.substring(0, len) + "...";
    }

    // Q8
    public static boolean isNumeric(String str) {
        for (int i = 0; i < str.length(); i++)
            if (!Character.isDigit(str.charAt(i)))
                return false;
        return true;
    }

    // Q9
    public static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random r = new Random();
        String res = "";
        for (int i = 0; i < length; i++)
            res += chars.charAt(r.nextInt(chars.length()));
        return res;
    }

    // Q10
    public static int countWords(String str) {
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {

        System.out.println("Q1: " + isNullOrEmpty("   "));
        System.out.println("Q2: " + countOccurrences("AIET AIET", "AIET"));
        System.out.println("Q3: " + reverseString("Java"));
        System.out.println("Q4: " + isPalindrome("Madam"));
        System.out.println("Q5: " + removeWhitespace("A I E T"));
        System.out.println("Q6: " + capitalizeWords("java programming"));
        System.out.println("Q7: " + truncate("Java Programming", 5));
        System.out.println("Q8: " + isNumeric("12345"));
        System.out.println("Q9: " + generateRandomString(6));
        System.out.println("Q10: " + countWords("Java is easy"));
    }
}