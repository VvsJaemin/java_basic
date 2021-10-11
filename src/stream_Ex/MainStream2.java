package stream_Ex;

import java.util.Arrays;
import java.util.List;

public class MainStream2 {
    public static void main(String[] args) {
        //스트림 API에서 람다를 매개변수로 사용하여 원본 데이터를 이용하여 새로운 데이터를 생성하는데 많이 사용되는 메세드
        //1) map : 새로운 데이터
        //2) filter : 데이터 필터링
        //3) reduce : 누적 연산(집계, 통계)

        // stream api에서 가장 많이 사용하는 메서드
        // forEach(), sorted(), 집계순서 count(), sum()
        // map() : 원본데이터를 새로운 데이터로 가공
        // filter() : 원본데이터의 일부를 새로운 데이터로 가공
        // reduce() : 원본데이터를 누적

        //map()
        List<String> list = Arrays.asList("광개토대왕", "이순신", "세종대왕", "김유신");
        list.stream().map(s -> s.length()).forEach(n -> System.out.println(n));

        //filter()
        list.stream().filter(s -> s.endsWith("왕")).forEach(s -> System.out.println(s));

        //reduce(초기값, 람다)
        List<Integer> list2 = Arrays.asList(5, 9, 10, 13, 7, 6);
        int sum = list2.stream().reduce(0, (a, b) -> a + b);
        /*
         * a	b
         * 0	5	->	5
         * 5	9	->	14
         * 14	10	->	24
         */
        System.out.println(sum);

        //컬렉션 연산 -> 스트림을 이용하면 -> 간결, 가독성, 속도, 병렬처리(여러개의 cpu가 나누어서 작업)

    }
}
