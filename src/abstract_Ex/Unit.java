package abstract_Ex;
 //상속 -> 오버라이딩 -> 추상메서드 -> 추상클래스
public abstract class Unit {
    // attack() 내용 없음 -> 상속받는 클래스에 맞게 오버라이딩 하기  -> 강제성이 없다.

     // 추상메서드 : 구현이 안되어 있는 메서드
     public abstract void attack();
     // 추상메서드를 하나라도 가진 클래스는 추상클래스가 된다 ->  추상 클래스는 객체를 만들수 없다.

     public void move() {
         System.out.println("유닛이 이동하다.");
     }
}
