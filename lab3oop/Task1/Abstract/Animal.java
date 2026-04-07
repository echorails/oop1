package Task1.Abstract;

public abstract class Animal {
    private int age;
    private String name;

    public Animal(int age, String name){
        this.age = age;
        this.name = name;
    }

    public void sleep(){
        System.out.println("Zzz");
    }

    public void eat(){
        System.out.println(name + "is eating");
    }

    public abstract void speaking();

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
    
}
