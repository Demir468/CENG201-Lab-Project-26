public class Main {
    public static void main(String[] args) {
        System.out.println("=== TASK 1: STUDENT LINKED LIST TEST ===");
        StudentList fatuiList = new StudentList();

        // Adding 5 students (Fatui Harbingers)
        fatuiList.addStudent(new Student(101, "Il Capitano", "Combat & Vanguard Division", 3.98, 140));
        fatuiList.addStudent(new Student(102, "Il Dottore", "Bio-Alchemy & Heresy", 3.92, 135));
        fatuiList.addStudent(new Student(103, "Columbina", "Damselette Choir Studies", 3.85, 110));
        fatuiList.addStudent(new Student(104, "Arlecchino", "House of the Hearth Intel", 3.88, 125));
        fatuiList.addStudent(new Student(106, "Scaramouche", "Inazuma Puppetry & Mech", 3.45, 95));

        System.out.println("\nInitial List:");
        fatuiList.printList();

        // Removing 1 student by ID
        System.out.println("\nRemoving student with ID 106...");
        fatuiList.removeStudent(106);

        // Searching for 1 student by ID
        System.out.println("\nSearching for student with ID 104...");
        Student found = fatuiList.findStudent(104);
        if (found != null) {
            System.out.println("Found -> " + found);
        } else {
            System.out.println("Student not found!");
        }

        // Printing final list
        System.out.println("\nFinal Student List after operations:");
        fatuiList.printList();
    }
}
