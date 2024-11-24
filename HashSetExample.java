import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> hashSet = new HashSet<>();
        
        // Adding elements to the HashSet
        hashSet.add("Red");
        hashSet.add("Green");
        hashSet.add("Blue");

        // Displaying elements of the HashSet
        System.out.println("Elements in HashSet: " + hashSet);

        // Removing an element
        hashSet.remove("Green");

        // Displaying elements after removal
        System.out.println("Elements after removal: " + hashSet);
    }
}
