package collection_Ex;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("선장", "루피");
        map.put("부선장", "조로");
        map.put("요리사", "상디");

        System.out.println(map.get("부선장"));

        for (String k : map.keySet()) { // 키 값만 출력
            System.out.println(k);
            System.out.println(map.get(k));
        }

        for (String v : map.values()) { // 값만 출력
            System.out.println(v);
        }
    }
}
