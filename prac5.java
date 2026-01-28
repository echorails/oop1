import java.lang.Math;
import java.util.Scanner;

public class prac5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("write your initial balance");

        double initial = sc.nextDouble();

        System.out.println("write your interest rate in percents (%)");

        double interestRate = sc.nextDouble() / 100;



        double interest = initial * interestRate;
        double newbalance = interest + initial;

        System.out.print(newbalance);

    }
}
