package Task5;

public class Main {
    public static void main(String[] args) {

        Chocolate[] c = {
            new Chocolate("Twix", 50),
            new Chocolate("Mars", 45),
            new Chocolate("Snickers", 60)
        };

        Time[] t = {
            new Time(10, 20, 0),
            new Time(8, 10, 0),
            new Time(12, 5, 0)
        };

        Employee[] e = {
            new Employee("A", 3000),
            new Employee("B", 2000),
            new Employee("C", 5000)
        };

        System.out.println("Before:");
        Sort.print(c);

        Sort.bubbleSort(c);

        System.out.println("After:");
        Sort.print(c);


        Sort.selectionSort(t);
        Sort.print(t);

        Sort.bubbleSort(e);
        Sort.print(e);
    }
}
