import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Creating a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        
        // Adding elements to the PriorityQueue
        priorityQueue.add(30);
        priorityQueue.add(20);
        priorityQueue.add(40);

        // Displaying elements of the PriorityQueue
        System.out.println("Elements in PriorityQueue: " + priorityQueue);

        // Removing an element
        priorityQueue.poll();

        // Displaying elements after removal
        System.out.println("Elements after removal: " + priorityQueue);
    }
}
