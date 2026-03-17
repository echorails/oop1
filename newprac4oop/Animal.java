public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void breathe() {
        System.out.println(name + " is breathing");
    }

    public void move() {
        System.out.println(name + " is moving");
    }
}