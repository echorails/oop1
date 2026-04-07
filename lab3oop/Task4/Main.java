package Task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Timur", 5000, new Date(), "A");
        Employee e2 = new Employee("Danil", 7000, new Date(), "B");

        Manager m1 = new Manager("Milana", 7000, new Date(), "C", 2000);

        m1.addEmployee(e1);
        m1.addEmployee(e2);

        System.out.println(e1);
        System.out.println(m1);

        System.out.println("\nCompare:");
        System.out.println(e1.compareTo(e2));

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(m1);

        System.out.println("\nSort by name:");
        Collections.sort(list, new SortByName());
        for (Employee e : list) System.out.println(e);

        System.out.println("\nSort by hire date:");
        Collections.sort(list, new SortByHireDate());
        for (Employee e : list) System.out.println(e);

        System.out.println("\nClone:");
        Employee e3 = (Employee) e1.clone();
        System.out.println(e3);
    }
}