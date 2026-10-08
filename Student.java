// CENG 201 Lab Project - Task 1
// Student class representing registered members (Fatui Harbingers theme)

public class Student {
    int studentId;
    String name;
    String department;
    double gpa;
    int completedCredits;

    // constructor to initialize student attributes
    public Student(int studentId, String name, String department, double gpa, int completedCredits) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
        this.gpa = gpa;
        this.completedCredits = completedCredits;
    }

    @Override
    public String toString() {
        return "ID: " + studentId + " | Name: " + name + " | Dept: " + department 
                + " | GPA: " + gpa + " | Credits: " + completedCredits;
    }
}
