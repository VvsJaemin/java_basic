package stream_Ex;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
//0. 스트림
//
//자바 컬럭션 데이터타입을 하나의 스트림에 놓고 연산하는 API
//
//- 여러개의 참조값 접근없이 하나의 스트림을 다루기에 속도가 빠르다
//
//- 스트림은 1회성이다. 한번 소모하고 나면 끝이다. 재활용이 불가하다.
public class MainStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("루피", "조로", "나미", "상디");

        // 1) for문 사용
        // 식당 대기자들을 차례가 되면 직접 찾아가서 불러오는 방법
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 2) 이터레이터 반복
        // 식당 대기자들을 순서대로 대기실에 줄을 세워놓고 다음 -> 다음 호출하는 방법
        Iterator<String> it = list.iterator();
        while (it.hasNext()) { //  순서대로 커서를 이동
            System.out.println(it.next());
        }

        // 3) foreach문 사용
        // 2)번 방법과 동일 : 이터레이터 대신 foreach 사용
        for (String s : list) {
            System.out.println(s);
        }

        // 4) Stream API와 람다
        // 하나의 스트림으로 모아서 연산 -> 루피조로나미상디
        // -> 내부적으로 특정 구분자를 사용하여 스트림을 구분하게 됨  ex)  ex) 루피#조로#나미#상디 or 루피0조로0나미0상디 ...
        list.stream().forEach((s) -> System.out.println(s)); // 매개변수로 함수형 인터페이스(매개변수 하나를 입력 받는 추상메서드를 가진)를 사용함
        list.stream().forEach(s -> System.out.println(s));
        list.stream().forEach(System.out::println); // 메서드 참조
    }
}
