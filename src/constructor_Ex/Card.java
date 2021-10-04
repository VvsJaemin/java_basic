package constructor_Ex;

public class Card {
    // 일반필드 : 객체멤버, 객체마다 다른 고유의 값을 가짐
    public int num;
    public String kind;

    // 정적필드 : 클래스멤버, 같은 타입의 객체는 같은 값을 가짐(하나의 값을 공유)
    public static int width;
    public static int height;
    public static int size;

    // 일반메서드는 객체가 만들어진 이후 사용 가능
    public void print() {
        System.out.println(Card.size); // 객체보다 먼저
        System.out.println(num); // 객체가 만들어진 이후 사용가능
    }

    public static void write() {
        System.out.println(Card.size); // 객체보다 먼저
    }
}
