// Custom Queue implementation using Linked List (FIFO behavior)
// Manages students waiting to register for courses

public class RegistrationQueue {

    private class Node {
        RegistrationRequest data;
        Node next;

        Node(RegistrationRequest data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;
    private int count;

    public RegistrationQueue() {
        this.front = null;
        this.rear = null;
        this.count = 0;
    }

    // adds a request to the back of the queue (O(1))
    public void enqueue(RegistrationRequest request) {
        Node newNode = new Node(request);
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        count++;
        System.out.println("Enqueued: Student " + request.studentId + " for " + request.courseCode);
    }

    // removes and returns the first request in line (O(1))
    public RegistrationRequest dequeue() {
        if (front == null) {
            System.out.println("Queue is empty, no request to process.");
            return null;
        }
        RegistrationRequest processed = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        count--;
        System.out.println("Processed (Dequeued): " + processed);
        return processed;
    }

    // returns total waiting requests
    public int size() {
        return count;
    }

    // prints all waiting requests from front to rear
    public void printQueue() {
        if (front == null) {
            System.out.println("Registration queue is empty.");
            return;
        }
        System.out.println("--- Waiting Course Registration Queue (Size: " + count + ") ---");
        Node temp = front;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("--------------------------------------------------------");
    }
}
