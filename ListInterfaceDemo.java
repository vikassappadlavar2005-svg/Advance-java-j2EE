package basics;

import java.util.*;

public class ListInterfaceDemo {
    public static void main(String[] args) {

        // ================= ARRAYLIST =================
        System.out.println("=== ArrayList Operations ===");

        ArrayList<String> arrayList = new ArrayList<>();

        // 1. Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        System.out.println("After adding elements: " + arrayList);

        // 2. Adding element at specific index
        arrayList.add(1, "Mango");
        System.out.println("After adding Mango at index 1: " + arrayList);

        // 3. Adding multiple elements
        arrayList.addAll(Arrays.asList("Grape", "Pineapple"));
        System.out.println("After adding multiple elements: " + arrayList);

        // 4. Accessing elements
        System.out.println("Element at index 0: " + arrayList.get(0));

        // 5. Updating elements
        arrayList.set(1, "Kiwi");
        System.out.println("After updating index 1: " + arrayList);

        // 6. Removing elements
        arrayList.remove("Orange");
        arrayList.remove(0);
        System.out.println("After removing elements: " + arrayList);

        // 7. Searching elements
        System.out.println("Contains Kiwi? " + arrayList.contains("Kiwi"));
        System.out.println("Index of Grape: " + arrayList.indexOf("Grape"));

        // 8. List size
        System.out.println("Size of list: " + arrayList.size());

        // 9. Iterating over list
        System.out.println("Using for-each loop:");
        for (String item : arrayList) {
            System.out.println(item);
        }

        // 10. Using Iterator
        System.out.println("Using Iterator:");
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 11. Sorting
        Collections.sort(arrayList);
        System.out.println("After sorting: " + arrayList);

        // 12. Sublist
        List<String> subList = arrayList.subList(0, Math.min(2, arrayList.size()));
        System.out.println("Sublist: " + subList);

        // 13. Clearing the list
        arrayList.clear();
        System.out.println("After clearing: " + arrayList);


        // ================= LINKEDLIST =================
        System.out.println("\n=== LinkedList Operations ===");

        LinkedList<String> linkedList = new LinkedList<>();

        // 1. Adding elements
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        System.out.println("After adding elements: " + linkedList);

        // 2. Adding at index
        linkedList.add(1, "Mango");
        System.out.println("After adding Mango at index 1: " + linkedList);

        // 3. Adding multiple elements
        linkedList.addAll(Arrays.asList("Grape", "Pineapple"));
        System.out.println("After adding multiple elements: " + linkedList);

        // 4. Accessing elements
        System.out.println("Element at index 0: " + linkedList.get(0));

        // 5. Updating elements
        linkedList.set(1, "Kiwi");
        System.out.println("After updating index 1: " + linkedList);

        // 6. Removing elements
        linkedList.remove("Orange");
        linkedList.remove(0);
        System.out.println("After removing elements: " + linkedList);

        // 7. Searching elements
        System.out.println("Contains Kiwi? " + linkedList.contains("Kiwi"));

        // 8. Size
        System.out.println("Size: " + linkedList.size());

        // 9. Iteration
        System.out.println("Using for-each:");
        for (String item : linkedList) {
            System.out.println(item);
        }

        // 10. Iterator
        System.out.println("Using Iterator:");
        Iterator<String> it2 = linkedList.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        // 11. Sorting
        Collections.sort(linkedList);
        System.out.println("After sorting: " + linkedList);

        // 12. Sublist
        List<String> subList2 = linkedList.subList(0, Math.min(2, linkedList.size()));
        System.out.println("Sublist: " + subList2);

        // 13. Clear
        linkedList.clear();
        System.out.println("After clearing: " + linkedList);
    }
}