import java.util.Scanner;

public class prac3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        String g = (s>=95)?"A":(s>=90)?"A-":(s>=85)?"B+":(s>=80)?"B":
                  (s>=75)?"B-":(s>=70)?"C+":(s>=65)?"C":(s>=60)?"C-":
                  (s>=55)?"D+":(s>=50)?"D":"F";

        System.out.println(g);
    }
}
