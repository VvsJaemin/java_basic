package collection_Ex;

import java.util.HashSet;
import java.util.Set;

public class Ex2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(7);
        set.add(3);
        set.add(2);
        set.add(3);

        System.out.println(set);
        //1) 중복허용 x
        // 2) 순서가 없다

        // set은 for문을 사용할 수 없다 - > set은 순서(인덱스)가 없기에

        //foreach는 가능
        for (Integer n : set) {
            System.out.println(n);
        }
    }
}
