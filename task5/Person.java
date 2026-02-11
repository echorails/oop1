
public class Person {
    
    private Gender gender;
    private String name;  
    
    public Person(Gender gender) {
        this.gender = gender;
        this.name = gender == Gender.BOY ? "B" : "G";
    }
    
    public Person(Gender gender, String name) {
        this.gender = gender;
        this.name = name;
    }
    
    public Gender getGender() {
        return gender;
    }
}