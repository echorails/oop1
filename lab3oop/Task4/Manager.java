package Task4;

import java.util.*;

public class Manager extends Employee {

    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double salary, Date hireDate, String insuranceNumber, double bonus) {
        super(name, salary, hireDate, insuranceNumber);
        this.bonus = bonus;
        this.team = new Vector<>();
    }

    public void addEmployee(Employee e) {
        team.add(e);
    }

    public double getBonus() {
        return bonus;
    }

    public String toString() {
        return super.toString() +
                ", Bonus: " + bonus +
                ", Team size: " + team.size();
    }

    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Manager)) return false;

        Manager m = (Manager) o;

        return Double.compare(bonus, m.bonus) == 0;
    }

    public int compareTo(Employee e) {
        if (e instanceof Manager) {
            Manager m = (Manager) e;

            int salaryCompare = Double.compare(this.getSalary(), m.getSalary());
            if (salaryCompare != 0) return salaryCompare;

            return Double.compare(this.bonus, m.bonus);
        }

        return super.compareTo(e);
    }

    public Object clone() {
        Manager copy = new Manager(getName(), getSalary(), new Date(getHireDate().getTime()), getInsuranceNumber(), bonus);
        copy.team = new Vector<>(team);
        return copy;
    }
}