package task2;
public class Character {

    // read-only поля (final)
    private final String id;
    private final Race race;

    private String name;
    private int level = 1;

    // требуемые static + final
    public static final int MAX_LEVEL = 50;

    // static non-final (меняется)
    public static double expMultiplier = 1.0;

    // блок инициализации
    {
        System.out.println("[новый персонаж создан]");
    }

    public Character(String id, Race race, String name) {
        this.id   = id;           // this №1
        this.race = race;
        this.name = name;
        this.level = 1;           // this №2
    }

    // перегрузка методов
    public void gainExp(int amount) {
        gainExp(amount, false);
    }

    public void gainExp(int amount, boolean event) {
        double mult = expMultiplier;
        if (event) mult *= 1.5;

        int exp = (int)(amount * mult);
        System.out.println(name + " → +" + exp + " опыта");

        level++;
        if (level > MAX_LEVEL) level = MAX_LEVEL;
    }

    public void rename(String newName) {
        System.out.println(name + " → " + newName);
        this.name = newName;      // this №3 (можно оставить или убрать)
    }

    public static void setEventBoost(double value) {
        expMultiplier = value;
        System.out.println("Буст опыта ×" + value);
    }
}


