package Task6;

public interface PetKeeper {
    void assignPet(Animal pet);
    void removePet();
    boolean hasPet();
    void leavePetWith(Person caretaker);
    void retrievePetFrom(Person caretaker);
}