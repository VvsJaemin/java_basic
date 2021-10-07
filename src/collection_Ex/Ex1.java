package collection_Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(7);
        list.add(3);
        list.add(2);
        list.add(3);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Integer n : list) {
            System.out.println(n);
        }

        Collections.sort(list);
        System.out.println(list);
    }
}
