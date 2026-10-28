public class Main {
    public static void main(String[] args) {
        System.out.println("=== TASK 1: STUDENT LINKED LIST TEST ===");
        StudentList fatuiList = new StudentList();

        fatuiList.addStudent(new Student(101, "Il Capitano", "Combat & Vanguard Division", 3.98, 140));
        fatuiList.addStudent(new Student(102, "Il Dottore", "Bio-Alchemy & Heresy", 3.92, 135));
        fatuiList.addStudent(new Student(103, "Columbina", "Damselette Choir Studies", 3.85, 110));
        fatuiList.addStudent(new Student(104, "Arlecchino", "House of the Hearth Intel", 3.88, 125));
        fatuiList.addStudent(new Student(106, "Scaramouche", "Inazuma Puppetry & Mech", 3.45, 95));

        System.out.println("\nInitial List:");
        fatuiList.printList();

        System.out.println("\nRemoving student with ID 106...");
        fatuiList.removeStudent(106);

        System.out.println("\nSearching for student with ID 104...");
        Student found = fatuiList.findStudent(104);
        if (found != null) {
            System.out.println("Found -> " + found);
        }

        System.out.println("\nFinal Student List after operations:");
        fatuiList.printList();

        // ---------------------------------------------------------
        System.out.println("\n=== TASK 2: COURSE REGISTRATION QUEUE TEST ===");
        RegistrationQueue regQueue = new RegistrationQueue();
        long baseTime = 1730000000L;

        regQueue.enqueue(new RegistrationRequest(101, "FATUI-101: Delusion Mastery", baseTime + 10));
        regQueue.enqueue(new RegistrationRequest(102, "ABYSS-202: Irminsul Data Mining", baseTime + 25));
        regQueue.enqueue(new RegistrationRequest(103, "SNEZ-305: Cryo Archon Diplomacy", baseTime + 40));
        regQueue.enqueue(new RegistrationRequest(104, "HEARTH-104: Covert Espionage", baseTime + 55));
        regQueue.enqueue(new RegistrationRequest(105, "MECH-210: Ruin Guard Engineering", baseTime + 70));
        regQueue.enqueue(new RegistrationRequest(108, "DIPLO-301: Gnosis Negotiation", baseTime + 85));
        regQueue.enqueue(new RegistrationRequest(109, "ECON-401: Northland Bank Finance", baseTime + 100));
        regQueue.enqueue(new RegistrationRequest(111, "COMBAT-109: Foul Legacy Tactics", baseTime + 115));

        System.out.println("\nProcessing 3 requests from the queue...");
        regQueue.dequeue();
        regQueue.dequeue();
        regQueue.dequeue();

        System.out.println("\nRemaining Queue after processing 3 requests:");
        regQueue.printQueue();

        // ---------------------------------------------------------
        System.out.println("\n=== TASK 3: COURSE DROP STACK TEST ===");
        DropStack dropStack = new DropStack();

        // Adding 5 course-drop records
        dropStack.push(new DropRecord(106, "SNEZ-305: Cryo Archon Diplomacy", baseTime + 200));
        dropStack.push(new DropRecord(108, "COMBAT-109: Foul Legacy Tactics", baseTime + 250));
        dropStack.push(new DropRecord(111, "ECON-401: Northland Bank Finance", baseTime + 310));
        dropStack.push(new DropRecord(102, "HEARTH-104: Covert Espionage", baseTime + 380));
        dropStack.push(new DropRecord(104, "MECH-210: Ruin Guard Engineering", baseTime + 420));

        System.out.println("\nTop record before popping (peek): " + dropStack.peek());

        // Processing (popping) 2 records
        System.out.println("\nPopping 2 drop records...");
        dropStack.pop();
        dropStack.pop();

        System.out.println("\nRemaining DropStack after popping 2 records:");
        dropStack.printStack();
    }
}
