package Task1.Abstract;

public class Main {
    public static void main(String[] args) {
        Cat murka = new Cat(2, "Murka");
        Dog bobik = new Dog(4, "Bobik");

        System.out.println("Cat:");
        System.out.println("Name: " + murka.getName());
        System.out.println("Age: " + murka.getAge());
        murka.eat();
        murka.sleep();
        murka.speaking();

        System.out.println();

        System.out.println("Dog:");
        System.out.println("Name: " + bobik.getName());
        System.out.println("Age: " + bobik.getAge());
        bobik.eat();
        bobik.sleep();
        bobik.speaking();
    }
}
