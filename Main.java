import service.AttendanceService;
import model.Student;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AttendanceService service = new AttendanceService();

        System.out.println("===== College Attendance Management System =====");

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Mark Attendance");
            System.out.println("3. View Attendance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Roll No: ");
                    String roll = sc.nextLine();
                    System.out.print("Enter Branch: ");
                    String branch = sc.nextLine();
                    System.out.print("Enter Year: ");
                    int year = sc.nextInt();
                    service.addStudent(new Student(1, name, roll, branch, year));
                    break;

                case 2:
                    System.out.print("Enter Roll No: ");
                    String r = sc.nextLine();
                    System.out.print("Enter Status (Present/Absent): ");
                    String status = sc.nextLine();
                    service.markAttendance(r, status);
                    break;

                case 3:
                    service.viewAttendance();
                    break;

                case 4:
                    System.out.println("Exiting... Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
