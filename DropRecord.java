// CENG 201 Lab Project - Task 3
// Represents a dropped course record for the LIFO stack

public class DropRecord {
    int studentId;
    String courseCode;
    long dropTime;

    public DropRecord(int studentId, String courseCode, long dropTime) {
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.dropTime = dropTime;
    }

    @Override
    public String toString() {
        return "[DropRecord] Student ID: " + studentId + " | Dropped Course: " + courseCode + " | Time: " + dropTime;
    }
}
