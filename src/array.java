import java.util.ArrayList;

public class array {
    public static void main(String[] args) {

        // Creating an ArrayList of type String
        ArrayList<String> names = new ArrayList<>();

        // Adding elements to the ArrayList
        names.add("John");
        names.add("Emma");
        names.add("Michael");
        names.add("Sophia");

        // Displaying the ArrayList
        System.out.println("Names List: " + names);

        // Accessing an element using index
        System.out.println("Element at index 1: " + names.get(1));

        // Removing an element
        names.remove("Michael");
        System.out.println("After removing 'Michael': " + names);

        // Checking if an element exists
        if (names.contains("Sophia")) {
            System.out.println("Sophia is present in the list");
        } else {
            System.out.println("Sophia is not present in the list");
        }

        // Finding size of the ArrayList
        System.out.println("Total names in list: " + names.size());
    }
}
