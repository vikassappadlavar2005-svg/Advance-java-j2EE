package basics;


	import java.util.LinkedList;

	public class p8 {
	    public static void main(String[] args) {

	        // Creating LinkedList
	        LinkedList<String> l_listobj = new LinkedList<>();

	        // Adding elements
	        l_listobj.add("Blue");
	        l_listobj.add("Green");
	        l_listobj.add("Yellow");

	        // Display original list
	        System.out.println("Original List: " + l_listobj);

	        // Inserting element at the end
	        l_listobj.offerLast("Pink");

	        // Display updated list
	        System.out.println("After adding Pink at end: " + l_listobj);
	    }
	}
