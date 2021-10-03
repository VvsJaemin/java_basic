package class_Ex;

import java.util.ArrayList;

public class Ex_8 {
    public static void main(String[] args) {
        String [] arr = new String[3];
        arr[0] = "루피";
        arr[1] = "조로";
        arr[2] = "나미";

        ArrayList<String> list = new ArrayList<>();
        list.add("루피");
        list.add("조로");
        list.add("나미");
        list.add("상디");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (String name : list) {
            System.out.println(name);
        }

        int x = 7;
        Integer y = 17;
        x=y;
        System.out.println(x);
        System.out.println(y);

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(7);
        intList.add(11);
        for (int num : intList) {
            System.out.println(num);
        }
    }
}
