import java.util.Scanner;
import java.lang.Math;


public class prac4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = sc.nextInt();

        int c = sc.nextInt();

        int d = b*b - 4*a*c;


if (d > 0) {
    double x1 = (-b + Math.sqrt(d)) / (2*a);
    double x2 = (-b - Math.sqrt(d)) / (2*a);
    System.out.println("x1 = " + x1 + ", x2 = " + x2);
} else if (d == 0) {
    System.out.println("error the d is negative");
}
    }
}
