import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDAO {

    // ADD student to database
    public void addStudent(Student s) {
        try {
            Connection conn = DatabaseConnection.getConnection();
            String query = "INSERT INTO students VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, s.id);
            ps.setString(2, s.name);
            ps.setInt(3, s.marks);
            ps.setString(4, s.grade);
            ps.executeUpdate();
            System.out.println("Student saved to database!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // VIEW all students from database
    // VIEW all students from database
    public void viewAllStudents() {
        int maxMarks = -1;
        TopperStudent topper = null;

        try {
            Connection conn = DatabaseConnection.getConnection();
            String query = "SELECT * FROM students";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            System.out.println("\n--- All Students ---");

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                int marks = rs.getInt("marks");
                String grade = rs.getString("grade");

                System.out.println("ID: " + id +
                        " | Name: " + name +
                        " | Marks: " + marks +
                        " | Grade: " + grade);

                // Find topper
                if (marks > maxMarks) {
                    maxMarks = marks;
                    topper = new TopperStudent(id, name, marks);
                }
            }

            // Display topper
            if (topper != null) {
                System.out.println("\n--- Topper Student ---");
                topper.display();
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    // SEARCH student by ID
    public void searchStudent(int searchId) {
        try {
            Connection conn = DatabaseConnection.getConnection();
            String query = "SELECT * FROM students WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, searchId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println("Student Found!");
                System.out.println("ID: " + rs.getInt("id") +
                        " | Name: " + rs.getString("name") +
                        " | Marks: " + rs.getInt("marks") +
                        " | Grade: " + rs.getString("grade"));
            } else {
                System.out.println("No student found with ID: " + searchId);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
