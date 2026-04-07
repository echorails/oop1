package Task2;

public class Bird implements Flyable {

    private int speed;

    public Bird(int speed) {
        this.speed = speed;
    }

    public void move() {
        System.out.println("Bird is flying");
    }

    public int getSpeed() {
        return speed;
    }

    public void flyUp() {
        System.out.println("Bird flies up");
    }

    public void land() {
        System.out.println("Bird lands on a tree");
    }
}