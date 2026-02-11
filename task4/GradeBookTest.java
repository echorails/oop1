import java.util.Scanner;

public class GradeBookTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Course course = new Course(
            "CS101 Object-oriented Programming and Design",
            "Introduction to OOP concepts and Java",
            3,
            "Basic programming"
        );

        GradeBook gb = new GradeBook(course);

        gb.displayMessage();

        String[] names = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        String[] ids   = {"1", "4", "3", "87", "5", "6", "7", "8", "9", "10"};

        for (int i = 0; i < names.length; i++) {
            gb.addStudent(new Student("Student " + names[i], names[i], 2, 1));
        }

        System.out.println("Please, input grades for students:");
        for (Student s : gb.getStudents()) {   
            System.out.print("Student " + s.get_name().replace("Student ", "") + ": ");
            int grade;
            while (true) {
                if (sc.hasNextInt()) {
                    grade = sc.nextInt();
                    if (grade >= 0 && grade <= 100) {
                        s.setGrade(grade);
                        break;
                    } else {
                        System.out.print("Введите число от 0 до 100: ");
                    }
                } else {
                    System.out.print("Введите число: ");
                    sc.next(); 
                }
            }
        }

        System.out.println();  
        gb.displayGradeReport();

        sc.close();
    }
}