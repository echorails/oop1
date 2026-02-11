
import java.util.Vector;

public class DragonLaunch {
    
    private Vector<Person> line = new Vector<>();
    
    public void kidnap(Person p) {
        line.add(p);
    }
    
    public boolean willDragonEatOrNot() {
        if (line.isEmpty()) {
            return false;
        }
        
        int left = 0;
        int right = line.size() - 1;
        int remaining = line.size();
        
        while (left < right) {
            Person pLeft  = line.get(left);
            Person pRight = line.get(right);
            
            if (pLeft.getGender() == Gender.BOY && pRight.getGender() == Gender.GIRL) {
                remaining -= 2;
                left++;
                right--;
            }
            else if (pLeft.getGender() == Gender.GIRL && pRight.getGender() == Gender.BOY) {
                left++;
                right--;
            }
            else {
                left++;
                right--;
            }
        }
        
        return remaining > 0;
    }
    
    public void printLine() {
        System.out.print("Line: ");
        for (Person p : line) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        DragonLaunch dl = new DragonLaunch();
        
        dl.kidnap(new Person(Gender.BOY));
        dl.kidnap(new Person(Gender.BOY));
        dl.kidnap(new Person(Gender.BOY));
        dl.kidnap(new Person(Gender.GIRL));
        dl.kidnap(new Person(Gender.GIRL));
        System.out.print("BB BGG → ");
        System.out.println(dl.willDragonEatOrNot() ? "Ест" : "Не ест");
        
        dl = new DragonLaunch();
        dl.kidnap(new Person(Gender.GIRL));
        dl.kidnap(new Person(Gender.BOY));
        dl.kidnap(new Person(Gender.GIRL));
        dl.kidnap(new Person(Gender.BOY));
        System.out.print("GBGB → ");
        System.out.println(dl.willDragonEatOrNot() ? "Ест" : "Не ест");
        
        dl = new DragonLaunch();
        dl.kidnap(new Person(Gender.BOY));
        dl.kidnap(new Person(Gender.GIRL));
        dl.kidnap(new Person(Gender.BOY));
        dl.kidnap(new Person(Gender.GIRL));
        System.out.print("BGBG → ");
        System.out.println(dl.willDragonEatOrNot() ? "Ест" : "Не ест");
        
        dl = new DragonLaunch();
        dl.kidnap(new Person(Gender.BOY));
        dl.kidnap(new Person(Gender.BOY));
        dl.kidnap(new Person(Gender.GIRL));
        dl.kidnap(new Person(Gender.GIRL));
        System.out.print("BBGG → ");
        System.out.println(dl.willDragonEatOrNot() ? "Ест" : "Не ест");
        
        dl = new DragonLaunch();
        dl.kidnap(new Person(Gender.BOY));
        System.out.print("B → ");
        System.out.println(dl.willDragonEatOrNot() ? "Ест" : "Не ест");
    }
}