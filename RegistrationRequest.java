// CENG 201 Lab Project - Task 2
// Holds course registration request info for the FIFO queue

public class RegistrationRequest {
    int studentId;
    String courseCode;
    long requestTime;

    public RegistrationRequest(int studentId, String courseCode, long requestTime) {
        this.studentId = studentId;
        this.courseCode = courseCode;
        this.requestTime = requestTime;
    }

    @Override
    public String toString() {
        return "[Request] Student ID: " + studentId + " | Course: " + courseCode + " | Timestamp: " + requestTime;
    }
}
