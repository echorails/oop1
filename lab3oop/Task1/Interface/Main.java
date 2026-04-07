package Task1.Interface;

public class Main{
    public static void main(String[] args) {

        Moveable m1 = new Car();
        Moveable m2 = new Human();

        m1.move();
        m2.move();
    }
}