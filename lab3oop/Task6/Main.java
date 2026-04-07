package Task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person danil = new Employee("Danil", 30, "Engineer");
        Person timur = new PhDStudent("Timur", 26, "Computer Science", "AI");
        Person vlad = new Student("Vlad", 21, "Mathematics");

        Animal murka = new Cat("Chupakabrik", 5);
        Animal rex = new Dog("Dexter", 3);
        Animal coco = new Bird("Cocojambo", 2);
        Animal nemo = new Fish("Nemo", 1);

        danil.assignPet(murka);
        vlad.assignPet(rex);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(danil);
        registry.addPerson(timur);
        registry.addPerson(vlad);

        System.out.println("Initial registry:");
        System.out.println(registry);

        System.out.println("Animal sounds:");
        murka.makeSound();
        rex.makeSound();
        coco.makeSound();
        nemo.makeSound();

        System.out.println();

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

        System.out.println();
        System.out.println("Sorted people by age:");
        List<Person> people = new ArrayList<>();
        people.add(danil);
        people.add(timur);
        people.add(vlad);

        Collections.sort(people);

        for (Person p : people) {
            System.out.println(p.getName() + " - " + p.getAge());
        }

        System.out.println();
        System.out.println("Clone of animal:");
        Animal copiedCat = murka.copy();
        if (copiedCat != null) {
            System.out.println("Original: " + murka);
            System.out.println("Copy: " + copiedCat);
        }
    }
}