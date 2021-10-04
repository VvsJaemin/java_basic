package super_Ex;

public class BirdMain {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat(); // 부모(super)메서드
        bird.move(); // 부모(super) 메서드는 가려지고 자신의 move 실행 -> 오버라이딩
        bird.sleep(); // 자신(this) 메서드드
        Animal animal = new Animal();
        animal.eat();
        animal.move();
    }
}
