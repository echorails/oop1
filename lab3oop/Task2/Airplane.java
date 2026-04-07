package Task2;

public class Airplane implements Flyable {

    private int speed;

    public Airplane(int speed) {
        this.speed = speed;
    }

    public void move() {
        System.out.println("Airplane is moving in the air");
    }

    public int getSpeed() {
        return speed;
    }

    public void flyUp() {
        System.out.println("Airplane is taking off");
    }

    public void land() {
        System.out.println("Airplane is landing");
    }
}