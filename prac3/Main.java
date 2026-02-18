public class Main {
    public static void main(String[] args) {

        Horse h1 = new Horse();
        System.out.println(h1.voice());
        System.out.println(h1.eat());
        System.out.println(h1);


        Horse h2 = new Horse("Буран", 450, Gender.MALE, "казахская");
        System.out.println(h2.voice(2));
        System.out.println(h2.voice("весело"));
        System.out.println(h2.voice("зло"));
        System.out.println(h2);


        Horse h3 = new Horse("Гром", 520, Gender.MALE);
        System.out.println(h3);
        h3.printToString();

        System.out.println("Может пересечь границу? " + h3.crossTheBorder());
    }
}