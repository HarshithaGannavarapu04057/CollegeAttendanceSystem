package service;
import model.Student;
import java.util.*;

public class AttendanceService {
    private List<Student> students = new ArrayList<>();
    private Map<String, String> attendance = new HashMap<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Added: " + s);
    }

    public void markAttendance(String rollNo, String status) {
        attendance.put(rollNo, status);
        System.out.println("Attendance marked for " + rollNo + ": " + status);
    }

    public void viewAttendance() {
        System.out.println("\n--- Attendance Report ---");
        for (Student s : students) {
            String status = attendance.getOrDefault(s.getRollNo(), "Absent");
            System.out.println(s.getName() + " (" + s.getRollNo() + ") - " + status);
        }
    }
}
