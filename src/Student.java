public class Student {
    int id;
    String name;
    int marks;
    String grade;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;

        if (marks >= 90) {
            this.grade = "A";
        } else if (marks >= 75) {
            this.grade = "B";
        } else if (marks >= 60) {
            this.grade = "C";
        } else {
            this.grade = "F";
        }
    }

    public void display() {
        System.out.println("ID: " + id + " | Name: " + name +
                " | Marks: " + marks + " | Grade: " + grade);
    }
}
//My project uses classes and objects to represent Students,
// Constructor to initializze data and auto calculate grades ,
// Encapsulation by keeping student data & methods together in 1 class ,
// Abstraction by hiding the display logic inside the student class.