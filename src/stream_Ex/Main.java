package stream_Ex;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 스트림 생성과 소모, forEach(), 메서드 참조
        Stream<String> stream1 = Arrays.asList("a", "b", "c").stream();
        // 람다 사용
        stream1.forEach(s -> System.out.println(s));
       // stream1.forEach(s -> System.out.println(s)); // 예외발생 : 스트림 객체는 1회성

        //메서드 참조 사용(매개변수와 구현코드에 사용하는 변수가 하나이고(같은) 메서드도 하나일때)
        Stream<String> stream2 = Arrays.asList("a", "b", "c").stream();
        stream2.forEach(System.out::println);

    }
}
