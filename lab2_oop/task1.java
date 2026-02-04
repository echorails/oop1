class Student {
    private String student_name;
    private String student_id;
    private int year;
    private int imp;

    public Student(String student_name, String student_id, int year, int imp) {
        this.student_name = student_name;
        this.student_id = student_id;
        this.year = year;
        this.imp = imp;
    }

    public String get_name() {
        return student_name;
    }

    public String get_id() {
        return student_id;
    }

    public int get_year() {
        return year;
    }

    public int get_imp() {
        return imp;
    }

    public void YearChange() {
        year = year + imp;
    }
}



public class task1 {

    public static void main(String[] args) {
        Student student = new Student("Danil", "24B030316", 2, 1);

        System.out.println("Name: " + student.get_name());
        System.out.println("ID: " + student.get_id());
        System.out.println("Year of studying: " + student.get_year());
        System.out.println("Incremented value: " + student.get_imp() + " year/years");

        student.YearChange();

        System.out.println("New year: " + student.get_year());
    }
}



