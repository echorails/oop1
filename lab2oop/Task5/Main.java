package Task5;

public class Main {
    public static void main(String[] args) {

        Person danil = new Employee("Danil", 30, "Engineer");
        Person timur = new PhDStudent("Timur", 26, "Computer Science", "AI");
        Person vlad = new Student("Vlad", 21, "Mathematics");

        Animal murka = new Cat("Chupakabrik", 5);
        Animal rex = new Dog("Dexter", 3);
        Animal coco = new Bird("Cocojambo", 2);

        danil.assignPet(murka);
        vlad.assignPet(rex);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(danil);
        registry.addPerson(timur);
        registry.addPerson(vlad);

        System.out.println("Initial registry:");
        System.out.println(registry);

        danil.leavePetWith(timur);
        System.out.println("After Danil leaves cat with Timur:");
        System.out.println(registry);

        danil.retrievePetFrom(timur);
        System.out.println("After Danil retrieves cat from Timur:");
        System.out.println(registry);

        vlad.leavePetWith(timur);
        System.out.println("After Vlad tries to leave dog with Timur:");
        System.out.println(registry);

        timur.assignPet(coco);
        System.out.println("After Timur gets a bird:");
        System.out.println(registry);

        System.out.println("People with pets:");
        for (Person p : registry.findPeopleWithPets()) {
            System.out.println(p.getName());
        }

        System.out.println("People without pets:");
        for (Person p : registry.findPeopleWithoutPets()) {
            System.out.println(p.getName());
        }
    }
}