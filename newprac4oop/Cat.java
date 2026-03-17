public class Cat extends Animal implements CanHavePizza {
    private String breed;

    public Cat(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void eatPizza() {
        System.out.println(name + " the cat is eating pizza");
    }

    @Override
    public String toString() {
        return "Cat's name=" + name + "', breed='" + breed + "";
    }
}
    