import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        // Adding elements to the LinkedList
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        // Displaying elements of the LinkedList
        System.out.println("Elements in LinkedList: " + linkedList);

        // Adding an element at the beginning
        linkedList.addFirst(5);

        // Displaying elements after addition
        System.out.println("Elements after addition: " + linkedList);
    }
}
