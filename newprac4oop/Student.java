public class Student extends Person implements CanHavePizza {
    private double gpa;
    private String major;

    public Student(String name, int age, double gpa, String major) {
        super(name, age);
        this.gpa = gpa;
        this.major = major;
    }

    @Override
    public void eatPizza() {
        System.out.println(name + " the student is eating pizza");
    }

    public void study() {
        System.out.println(name + " is studying " + major);
    }

    @Override
    public String toString() {
        return "Student name=" + name + "', age=" + age + ", gpa=" + gpa + ", major='" + major + "";
    }
}