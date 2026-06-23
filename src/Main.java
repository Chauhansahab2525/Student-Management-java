import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection.getConnection();
        StudentDAO dao = new StudentDAO();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Student Result Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                System.out.print("Enter Name: ");
                String name = scanner.next();
                System.out.print("Enter Marks: ");
                int marks = scanner.nextInt();

                if (marks >= 90) {
                    Student s = new TopperStudent(id, name, marks);
                    dao.addStudent(s);
                } else {
                    Student s = new Student(id, name, marks);
                    dao.addStudent(s);
                }

            } else if (choice == 2) {
                dao.viewAllStudents();

            } else if (choice == 3) {
                System.out.print("Enter ID to search: ");
                int searchId = scanner.nextInt();
                dao.searchStudent(searchId);
            }

        } while (choice != 4);

        System.out.println("Goodbye!");
        scanner.close();
    }
}