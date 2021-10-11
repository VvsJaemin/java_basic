package lambda_Ex;

public class App {
    public static void main(String[] args) {
        A a1 = new A();
       a1.test(new IB(){ // 익명클래스(익명객체)
           @Override
           public void play() {
               System.out.println("play");
           }
       });

        A a2 = new A();
        a2.test(new IB(){ // 익명클래스(익명객체)
            @Override
            public void play() {
                System.out.println("gogo");
            }
        });
    }
}
    class A{
        // 명령 , 기능을 매개변수로 받고 싶을때 - > 메서드를 매개변수 x -> 메서드를 가진 객체를 매개변수로...
        public void test(IB ib) {
            ib.play();
        }
    }

    interface IB{
        void play();
    }

//자바스크립트에서 함수를 매개변수로 넘겨야 할때 마다 새로운 함수를 정의 해야한다. -> 익명함수(람다)
// 새로운 명령(기능)을 매개변수로 넘겨야 할때 마다 매번 IB의 구현 클래스를 만들어 한다 -> 익명클래스 -> 불편 -> 람다도입
// -> 람다를 저장하는 데이터 타입이 필요 -> 함수형 인터페이스 -> 함수형 프로그래밍 가능 -> Stream api 출현 -> 병렬처리

