

public class main {
    public static void main(String[] args) {

        Temperature t1 = new Temperature(100, 'C');
        System.out.println("100C in F = " + t1.getFahrenheit());

        Temperature t2 = new Temperature(32, 'F');
        System.out.println("32F in C = " + t2.getCelsius());
    }
}
