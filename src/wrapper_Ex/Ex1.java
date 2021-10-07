package wrapper_Ex;

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        // 1) 값타입(기본타입)
        // 2) 참조타입

        // 랩퍼 타입
        // ex) int값이 와야하는데 참조타입 필요?
        // 자바프로그램 코드에서 int와 동일하게 사용가능한 Integer라는 참조타입을 제공 -> 랩퍼타입
        // 그래서 Byte, Short, Integer, Long, Float, Double, Character, Boolean 이라는 8개의 랩퍼타입이 있다.

        Integer x = 0; // int 값이(값타입) - > Integer변수로(참조타입) - > 박싱 -> 오토박싱가능

        int y = x; //  Integer 값이 -> int변수로 - > 언박싱 -> 오토 언박싱

        // 값타입을 사용해야 되는 경우 : 대부분
        // 값타입을 사용할 수 없는 경우 : 참조타입으로 형변환이 필요한 경우

        // 컬렉션 프레임워크(자료구조 기본 API) : 랩퍼타입의 이해 없이 컬렉션 프레임워크를 하기에는...
        // List<>, Set<>, Map<> : <>안은 Object타입이어야한다.(다형성적용하면 모든 참조타입의 값이 올 수 있다)
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);

    }
}
