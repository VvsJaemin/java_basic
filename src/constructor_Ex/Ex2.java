package constructor_Ex;

public class Ex2 {
    public static void main(String[] args) {
        Card c1 = new Card();
        c1.num = 1;
        c1.kind = "spade";
        Card.width= 100;
        Card.height = 140;

        Card c2 = new Card();
        c2.num = 7;
        c2.kind = "diamond";

        System.out.println(c1.num + c1.kind+Card.width+Card.height);
        System.out.println(c2.num + c2.kind+Card.width+Card.height);
    }
}
