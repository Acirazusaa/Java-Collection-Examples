import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        
        // Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        // Displaying elements of the ArrayList
        System.out.println("Elements in ArrayList: " + arrayList);

        // Removing an element
        arrayList.remove("Banana");

        // Displaying elements after removal
        System.out.println("Elements after removal: " + arrayList);
    }
}
