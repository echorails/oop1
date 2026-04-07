package Task6;

import java.util.Objects;

public abstract class Person implements PetKeeper, Comparable<Person> {
    private String name;
    private int age;
    private Animal pet;
    private Animal vacationPet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Animal getPet() {
        return pet;
    }

    protected boolean canAcceptPet(Animal pet) {
        return true;
    }

    @Override
    public void assignPet(Animal pet) {
        if (pet == null) {
            System.out.println(name + " cannot receive a null pet.");
            return;
        }
        if (this.pet != null) {
            System.out.println(name + " already has a pet.");
            return;
        }
        if (!canAcceptPet(pet)) {
            System.out.println(name + " cannot take care of " + pet.getClass().getSimpleName() + ".");
            return;
        }
        this.pet = pet;
    }

    @Override
    public void removePet() {
        this.pet = null;
    }

    @Override
    public boolean hasPet() {
        return pet != null;
    }

    @Override
    public void leavePetWith(Person caretaker) {
        if (caretaker == null) {
            System.out.println("Caretaker does not exist.");
            return;
        }
        if (!hasPet()) {
            System.out.println(name + " has no pet to leave.");
            return;
        }
        if (caretaker.hasPet()) {
            System.out.println(caretaker.getName() + " already has a pet.");
            return;
        }

        Animal myPet = this.pet;

        if (!caretaker.canAcceptPet(myPet)) {
            System.out.println(caretaker.getName() + " cannot take care of " + myPet.getClass().getSimpleName() + ".");
            return;
        }

        this.vacationPet = myPet;
        this.removePet();
        caretaker.assignPet(myPet);
    }

    @Override
    public void retrievePetFrom(Person caretaker) {
        if (caretaker == null) {
            System.out.println("Caretaker does not exist.");
            return;
        }
        if (this.hasPet()) {
            System.out.println(name + " already has a pet.");
            return;
        }
        if (this.vacationPet == null) {
            System.out.println(name + " has no pet to retrieve.");
            return;
        }
        if (!caretaker.hasPet()) {
            System.out.println(caretaker.getName() + " does not have the pet.");
            return;
        }
        if (!caretaker.getPet().equals(this.vacationPet)) {
            System.out.println(caretaker.getName() + " is not holding " + name + "'s pet.");
            return;
        }

        Animal returnedPet = caretaker.getPet();
        caretaker.removePet();
        this.pet = returnedPet;
        this.vacationPet = null;
    }

    @Override
    public int compareTo(Person other) {
        if (this.age != other.age) {
            return this.age - other.age;
        }
        return this.name.compareTo(other.name);
    }

    public abstract String getOccupation();

    @Override
    public String toString() {
        String petInfo = hasPet() ? pet.toString() : "No pet";
        return getClass().getSimpleName() +
                "{name='" + name + "', age=" + age +
                ", occupation='" + getOccupation() +
                "', pet=" + petInfo + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        return age == person.age &&
                Objects.equals(name, person.name) &&
                getClass().equals(person.getClass());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, getClass());
    }
}