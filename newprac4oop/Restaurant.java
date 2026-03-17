public class Restaurant {
    public void servePizza(CanHavePizza eater) {
        System.out.println("Pizza is served");
        eater.eatPizza();

        if (eater instanceof Student) {
            System.out.println("Student pays for pizza");
        }

        if (eater instanceof Cat) {
            System.out.println("Cat gets free pizza");
        }
    }
}