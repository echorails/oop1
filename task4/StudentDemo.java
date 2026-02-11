public class StudentDemo {
    public static void main(String[] args){
        Student student = new Student("Danil", "24B030316", 2, 1);

        System.out.println("Name: " + student.get_name());
        System.out.println("ID: " + student.get_id());
        System.out.println("Year of studying: " + student.get_year());

        System.out.println("Implement " + student.get_imp() + "years");
        student.YearChange();
        
        System.out.println("The new year is " + student.get_year());
    }
}
