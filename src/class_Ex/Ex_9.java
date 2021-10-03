package class_Ex;

import java.util.ArrayList;

public class Ex_9 {
    public static void main(String[] args) {
        MyMethod m = new MyMethod();

        String[] arr = m.addMember("루피", "조로", "나미");
        for (String name : arr) {
            System.out.println(name);
        }

        ArrayList<String> list = m.addUser("루피", "조로", "나미");
        for (String name : list) {
            System.out.println(name);
        }
    }
}
