package Task4;

import java.util.*;

public class Employee extends Person implements Comparable<Employee>, Cloneable {

    private double salary;
    private Date hireDate;
    private String insuranceNumber;

    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public String toString() {
        return super.toString() +
                ", Salary: " + salary +
                ", HireDate: " + hireDate +
                ", Insurance: " + insuranceNumber;
    }

    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Employee)) return false;

        Employee e = (Employee) o;

        return Double.compare(salary, e.salary) == 0 &&
                Objects.equals(hireDate, e.hireDate) &&
                Objects.equals(insuranceNumber, e.insuranceNumber);
    }

    public int compareTo(Employee e) {
        return Double.compare(this.salary, e.salary);
    }

    public Object clone() {
        return new Employee(name, salary, new Date(hireDate.getTime()), insuranceNumber);
    }
}