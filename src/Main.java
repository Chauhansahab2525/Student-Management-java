import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Student Result Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search student by id");
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

                if(marks>90){
                    Student s=new TopperStudent(id,name,marks);
                    //System.out.println("Topper Student");
                    students.add(s);
                }
                else {

                    Student s = new Student(id, name, marks);
                    students.add(s);
                }
                System.out.println("Student added successfully!");



            } else if (choice == 2) {
                if (students.isEmpty()) {
                    System.out.println("No students found!");
                } else {
                    System.out.println("\n--- All Students ---");
                    for (Student s : students) {
                        s.display();
                    }
                }


        } else if (choice == 3) {
            System.out.print("Enter ID to search: ");
            int searchId = scanner.nextInt();
            boolean found = false;

            for (Student s : students) {
                if (s.id == searchId) {
                    System.out.println("Student Found!");
                    s.display();
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("No student found with ID: " + searchId);
            }
        }
    } while(choice !=4);
        System.out.println("Goodbye!");
        scanner.close();
}
}
