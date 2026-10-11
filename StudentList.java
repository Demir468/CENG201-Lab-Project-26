// Custom Singly Linked List to keep track of registered students
// Using custom Node class since java.util.LinkedList is not allowed

public class StudentList {

    // inner node class for singly linked list
    private class Node {
        Student data;
        Node next;

        Node(Student data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public StudentList() {
        this.head = null;
    }

    // adds a new student to the end of the linked list
    public void addStudent(Student s) {
        Node newNode = new Node(s);
        if (head == null) {
            head = newNode;
            System.out.println("Added to list: " + s.name);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Added to list: " + s.name);
    }

    // removes a student matching the given studentId
    public boolean removeStudent(int id) {
        if (head == null) {
            System.out.println("List is empty, cannot remove ID: " + id);
            return false;
        }

        // check if the student to remove is at the head
        if (head.data.studentId == id) {
            System.out.println("Removed student: " + head.data.name + " (ID: " + id + ")");
            head = head.next;
            return true;
        }

        Node current = head;
        while (current.next != null && current.next.data.studentId != id) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Student with ID " + id + " not found.");
            return false;
        }

        System.out.println("Removed student: " + current.next.data.name + " (ID: " + id + ")");
        current.next = current.next.next;
        return true;
    }

    // searches for a student by ID and returns the Student object
    public Student findStudent(int id) {
        Node current = head;
        while (current != null) {
            if (current.data.studentId == id) {
                return current.data;
            }
            current = current.next;
        }
        return null; // not found
    }

    // prints all students currently in the linked list
    public void printList() {
        if (head == null) {
            System.out.println("Student list is currently empty.");
            return;
        }
        System.out.println("--- Registered Students (Snezhnaya Academy) ---");
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("-----------------------------------------------");
    }
}
