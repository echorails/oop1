public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Gera", "British");
        Student student = new Student("Danil", 19, 3, "Computer Science");

        Restaurant restaurant = new Restaurant();

        System.out.println(cat);
        cat.breathe();
        cat.move();
        restaurant.servePizza(cat);

        System.out.println();

        System.out.println(student);
        student.breathe();
        student.move();
        student.eat();
        student.study();
        restaurant.servePizza(student);
    }
}