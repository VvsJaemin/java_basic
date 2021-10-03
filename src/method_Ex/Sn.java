package method_Ex;

import java.util.Scanner;

public class Sn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("주민번호 13자리를 입력하세요");

        String sn = "9929999191919";
        if (sn.length() != 13) {
            System.out.println("잘못입력하셨습니다. 올바르게 입력하세요");
        } else {
            System.out.println("입력한 주민번호 : " + sn);
        }

        String sn7 = sn.substring(6, 7);
        int sn7int = Integer.parseInt(sn7);
        String gender = "";

        if (sn7int % 2 == 0) {
            gender = "여";
        } else {
            gender = "남";
        }

        System.out.println("성별 : " + gender);

        int todayYear = 2021;
        String snYear = sn.substring(0, 2);
        int snYearInt = Integer.parseInt("19" + snYear);
        int age = todayYear - snYearInt;
        System.out.println("나이 : " + (age % 100));
    }
}
