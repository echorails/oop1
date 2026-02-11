import java.util.ArrayList;

public class GradeBook {

    private Course course;
    public ArrayList<Student> students = new ArrayList<>();

    public GradeBook(Course course) {
        this.course = course;
    }

    public ArrayList<Student> getStudents() {
    return students;
}

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName());
        System.out.println("Object-oriented Programming and Design, input grades for students");
        System.out.println();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayGradeReport() {
        if (students.isEmpty()) {
            System.out.println("No students.");
            return;
        }

        double sum = 0;
        int count = 0;
        int minGrade = 101;
        int maxGrade = -1;
        Student minStudent = null;
        Student maxStudent = null;

        int[] hist = new int[11];  

        for (Student s : students) {
            int g = s.getGrade();
            if (g < 0) continue;

            sum += g;
            count++;

            if (g < minGrade) {
                minGrade = g;
                minStudent = s;
            }
            if (g > maxGrade) {
                maxGrade = g;
                maxStudent = s;
            }

            int bucket = g / 10;
            if (bucket > 10) bucket = 10;
            hist[bucket]++;
        }

        double average = count > 0 ? sum / count : 0.0;

        System.out.printf("Class average is %.2f. ", average);

        if (minStudent != null) {
            System.out.printf("Lowest grade is %d (%s, id: %s).\n",
                    minGrade, minStudent.get_name(), minStudent.get_id());
        }
        if (maxStudent != null) {
            System.out.printf("Highest grade is %d (%s, id: %s).\n\n",
                    maxGrade, maxStudent.get_name(), maxStudent.get_id());
        }

        System.out.println("Grades distribution:");
        String[] ranges = {
            "00-09:","10-19:","20-29:","30-39:","40-49:",
            "50-59:","60-69:","70-79:","80-89:","90-99:","100:"
        };

        for (int i = 0; i < hist.length; i++) {
            System.out.print(ranges[i] + " ");
            for (int j = 0; j < hist[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public String toString() {
        return "GradeBook for " + course.getName();
    }

}
