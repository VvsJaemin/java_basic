package lambda_Ex;
// 자바에서 람다(함수)를 저장하기 위한 데이터타입
// interface 사용 -> 하나의 추상 메서드만 가져야 한다.
// 일반 interface인지
// 람다 데이터타입의 interface(추상메서드 하나만)
@FunctionalInterface
public interface FunVoidVoid {
    void hello();
}
