package super_Ex;
// 메서드의 입장에서 상속의 의미
// 1)부모 메서드를 가진다.
// 2) 메서드를 추가할 수 있다.
// * 3) 오버라이딩 -> 다형성과 연동...
public class Bird extends Animal{
    //@ Override 애노테이션을 통해 컴파일시 오버라이딩임을 검사기능

    @Override
    public void move() {
        System.out.println("날아가다");
    }

    public void sleep() {
        System.out.println("잠을 자다");
    }
}
