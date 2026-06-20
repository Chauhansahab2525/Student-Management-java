public class TopperStudent extends Student {

    public TopperStudent(int id, String name, int marks) {
        super(id, name, marks);
    }

    @Override
    public void display() {
        super.display();
        System.out.println("🏆 Scholarship Awarded!");
    }
}
//extends - Inheritance(Topper Student inherits from students)
//@override - Polymorphism (Same method , different behaviour)