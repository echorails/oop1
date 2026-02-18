import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        people.add(new Student("Тимур", "Алматы абая 15", "Информатика", 2, 450000));
        people.add(new Student("Данил", "Тараз назарбаева 51", "Менеджмент", 3, 380000));
        people.add(new Staff("Ерасыл", "Астана пушкина 1", "КазНУ", 320000));
        people.add(new Staff("Кайрат нуртас", "Шымкент калотушкина 15", "Шымкентский университет", 280000));

        while (true) {
            System.out.println("\n1. Показать всех");
            System.out.println("2. Добавить человека");
            System.out.println("0. Выход");
            System.out.print("Выбор: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 0) {
                break;
            }

            if (choice == 1) {
                for (Person p : people) {
                    System.out.println(p);
                }
            }

            else if (choice == 2) {
                System.out.print("Тип (student / staff): ");
                String type = sc.nextLine().trim().toLowerCase();

                System.out.print("Имя: ");
                String name = sc.nextLine();

                System.out.print("Адрес: ");
                String address = sc.nextLine();

                if (type.equals("student")) {
                    System.out.print("Программа: ");
                    String program = sc.nextLine();

                    System.out.print("Год обучения: ");
                    int year = sc.nextInt();

                    System.out.print("Плата за обучение: ");
                    double fee = sc.nextDouble();
                    sc.nextLine();

                    people.add(new Student(name, address, program, year, fee));
                }
                else if (type.equals("staff")) {
                    System.out.print("Школа/университет: ");
                    String school = sc.nextLine();

                    System.out.print("Зарплата: ");
                    double pay = sc.nextDouble();
                    sc.nextLine();

                    people.add(new Staff(name, address, school, pay));
                }
                
            }
        }

        sc.close();
    }
}