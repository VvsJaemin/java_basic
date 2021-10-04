package constructor_Ex;

public class CardMain {
    public static void main(String[] args) {
        Card.write();

        Card.size = 170;

        Card c1 = new Card();
        c1.num = 1;

        Card c2 = new Card();
        c2.num = 2;

        System.out.println(c1.size);
        System.out.println(c2.size);

        c1.size = 200; // Card.size --->200
        System.out.println(c2.size);
        c1.print();
        c2.print();
    }
}
