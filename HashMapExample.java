import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        // Adding key-value pairs to the HashMap
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // Displaying key-value pairs of the HashMap
        System.out.println("HashMap: " + hashMap);

        // Removing a key-value pair
        hashMap.remove("Two");

        // Displaying HashMap after removal
        System.out.println("HashMap after removal: " + hashMap);
    }
}
