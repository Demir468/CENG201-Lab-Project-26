// Custom Stack implementation using a Linked List (LIFO behavior)
// Keeps track of recent course-drop operations

public class DropStack {

    private class Node {
        DropRecord data;
        Node next;

        Node(DropRecord data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public DropStack() {
        this.top = null;
    }

    // pushes a new drop record onto the top of the stack
    public void push(DropRecord record) {
        Node newNode = new Node(record);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed to DropStack: Student " + record.studentId + " dropped " + record.courseCode);
    }

    // removes and returns the most recent drop record
    public DropRecord pop() {
        if (top == null) {
            System.out.println("DropStack is empty, nothing to pop.");
            return null;
        }
        DropRecord removed = top.data;
        top = top.next;
        System.out.println("Popped from DropStack: " + removed);
        return removed;
    }

    // returns the top record without removing it
    public DropRecord peek() {
        if (top == null) {
            System.out.println("DropStack is empty.");
            return null;
        }
        return top.data;
    }

    // prints all records from top (most recent) to bottom
    public void printStack() {
        if (top == null) {
            System.out.println("Drop stack is currently empty.");
            return;
        }
        System.out.println("--- Course Drop Stack (Top to Bottom) ---");
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("-----------------------------------------");
    }
}
