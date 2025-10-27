package db;
import java.sql.*;

public class DBConnection {
    private static Connection con;

    public static Connection getConnection() {
        if (con == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college_attendance", 
                    "root", 
                    "1234"
                );
                System.out.println("✅ Database Connected Successfully!");
            } catch (Exception e) {
                System.out.println("⚠️ Database Connection Failed: " + e.getMessage());
            }
        }
        return con;
    }
}
