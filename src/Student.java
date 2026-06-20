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