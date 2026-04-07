package Task5;

public class Chocolate implements Comparable<Chocolate> {
    String name;
    double weight;

    public Chocolate(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public int compareTo(Chocolate other) {
        if (this.weight > other.weight) return 1;
        if (this.weight < other.weight) return -1;
        return 0;
    }

    public String toString() {
        return name + " " + weight;
    }
}