package super_Ex;

public class SmartCar3 extends Car{
    // 자바언어에서의 상속
    // extends 키워드를 사용
    // 단일 상속만 가능
    // 모든 클래스는 Object클래스를 상속받는다
    // 객체생성시 new 연산자를 사용하며, new로 생성된 메모리 공간에는 부모 객체를 먼저 생성

    // 새로 추가한 부분
    public void selfDrive() {
        System.out.println("자율 주행");
    }

    public static void main(String[] args) {
        SmartCar3 sm3 = new SmartCar3();
        sm3.name = "그랜즈";
        sm3.color = "black";
        sm3.cc = 3000; // SmarCar3 클래스의 수정없이 Car에 추가된 필드 사용 가능
        System.out.println(sm3.cc);
    }
}
