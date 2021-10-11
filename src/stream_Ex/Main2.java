package stream_Ex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        // 스트림 정렬
        List<String> list = Arrays.asList("루피", "조로", "나미");

        list.stream().sorted().forEach(name -> System.out.println(name));

        list.stream().sorted(Comparator.reverseOrder()).forEach(
                name -> System.out.println(name)
        );
    }
}
