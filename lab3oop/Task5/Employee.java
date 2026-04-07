package Task5;

public class Employee implements Comparable<Employee> {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public int compareTo(Employee e) {
        if (this.salary > e.salary) return 1;
        if (this.salary < e.salary) return -1;
        return 0;
    }

    public String toString() {
        return name + " " + salary;
    }
}
