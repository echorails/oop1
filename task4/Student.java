

public class Student{

    private String student_name;
    private String student_id;
    private int year;
    private int imp;

        public Student(String student_name, String student_id, int year, int imp){
            this.student_name = student_name;
            this.student_id = student_id;
            this.year = year;
            this.imp = imp;
        }


    public String get_name(){
        return student_name;
    }

    public String get_id(){
        return student_id;
    }

    public int get_year(){
        return year;
    }

    public int get_imp(){
        return imp;
    }

    public void YearChange(){
        year = year + imp;
    }
    private int grade = -1; 

    public void setGrade(int g) {
        if (g >= 0 && g <= 100) {
            grade = g;
        }
    }

    public int getGrade() {
        return grade;
    }

}
