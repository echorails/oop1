public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void breathe() {
        System.out.println(name + " is breathing");
    }

    public void move() {
        System.out.println(name + " is moving");
    }

    public void eat() {
        System.out.println(name + " is eating food");
    }
}