package Task2;

public class Main {
    public static void main(String[] args) {

        Flyable plane = new Airplane(900);
        Flyable bird = new Bird(50);

        plane.flyUp();
        plane.move();
        System.out.println("Speed: " + plane.getSpeed());
        plane.land();

        System.out.println();

        bird.flyUp();
        bird.move();
        System.out.println("Speed: " + bird.getSpeed());
        bird.land();
    }
}
