package task2;
import java.util.Scanner;


public class Main{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Имя: ");
        String name = sc.nextLine();

        System.out.print("Раса (ELF DWARF HUMAN ORC): ");
        Race race = Race.valueOf(sc.nextLine().toUpperCase());

        Character c = new Character("C" + (int)(Math.random()*9999), race, name);

        System.out.println("Создан: " + c);

        c.gainExp(100);
        c.gainExp(200, true);
        c.rename("Lord " + name);

        Character.setEventBoost(2.0);
        c.gainExp(150);

        System.out.println("Макс уровень: " + Character.MAX_LEVEL);

    }
}
