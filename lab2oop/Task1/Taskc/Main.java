package Task1.Taskc;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Student> students = new HashSet<>();

        Student s1 = new Student("Alex", 20, "S101");
        Student s2 = new Student("Alex", 20, "S101"); // dublicat
        Student s3 = new Student("Maria", 22, "S102");

        students.add(s1);
        students.add(s2);
        students.add(s3);

        for(Student s : students){
            System.out.println(s);
        }

        System.out.println("Total students in set: " + students.size());
    }
}