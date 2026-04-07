package Task4;

import java.util.Objects;

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Name: " + name;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !(o instanceof Person)) return false;

        Person p = (Person) o;
        return Objects.equals(name, p.name);
    }
}