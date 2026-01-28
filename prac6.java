import java.util.Scanner;

public class prac6 {

    public static boolean ispali(String s){
        if(s == null){
            System.out.println("the string is empty");
            return true;
        }

        int left = 0;
        int right = s.length() - 1;

        while (right > left){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }

        left++;
        right--;

    }
    return true;
}


    public static void main(String[] args){
        System.out.println("please write a string");

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (ispali(s)){
            System.out.println("the string is polyndrome");
        }   else {
            System.out.println("the string is not a polyndrome");
        }

        
        }
    }



