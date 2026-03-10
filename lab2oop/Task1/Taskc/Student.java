package Task1.Taskc;

import java.util.Objects;

public class Student extends Person {

    private String studentId;

    public Student(String name, int age, String studentId){
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId(){
        return studentId;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof Student)) return false;

        Student student = (Student) o;

        return getName().equals(student.getName()) &&
               getAge() == student.getAge() &&
               studentId.equals(student.studentId);
    }

    @Override
    public int hashCode(){
        return Objects.hash(getName(), getAge(), studentId);
    }

    @Override
    public String toString(){
        return super.toString() + ", Student ID: " + studentId;
    }
}