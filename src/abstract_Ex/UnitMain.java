package abstract_Ex;

public class UnitMain {
    public static void main(String[] args) {
        // Unit은 추상클래스여서 객체를 만들수 없음.
        Tank tank = new Tank();
        tank.attack();

        Marine marine = new Marine();
        marine.attack();
    }
}
