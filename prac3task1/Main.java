

public class Main {
    public static void main(String[] args) {
        Chupacabra ch = new Chupacabra("Чупакабра", 18, Gender.MALE);

        System.out.println("Имя и статус: " + ch);
        System.out.println("Голос: " + ch.voice());
        System.out.println("Голос ×5: " + ch.voice(5));
        System.out.println("Ест: " + ch.eat());
        System.out.println("Ест много: " + ch.eat(800));
        System.out.println("Ест когда голодный: " + ch.eat(true));

        ch.move(15);
        System.out.println("Может перейти границу? " + ch.crossTheBorder());
    }
}