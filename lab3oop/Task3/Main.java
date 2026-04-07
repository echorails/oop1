package Task3;

public class Main {
    public static void main(String[] args) {

        MyCollection<String> collection = new MyArrayCollection<>();

        collection.add("Apple");
        collection.add("Banana");
        collection.add("Apple");

        System.out.println("Size: " + collection.size());

        System.out.println("Contains Apple: " + collection.contains("Apple"));
        System.out.println("Contains Orange: " + collection.contains("Orange"));

        collection.remove("Banana");

        System.out.println("Size after remove: " + collection.size());

        System.out.println("Is empty: " + collection.isEmpty());
    }
}