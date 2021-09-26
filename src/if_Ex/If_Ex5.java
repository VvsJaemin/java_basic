package if_Ex;

import java.util.Scanner;

public class If_Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("주민번호를 입력하세요");

        String pn = sc.next();

        int len = pn.length();

        System.out.println(pn);
        System.out.println(len);

        if (len != 13) {
            System.out.println("주민번호를 잘못 입력하셨습니다.");
        } else {
            String str = pn.substring(6, 7);
            int num = Integer.parseInt(str);
            if (num % 2 == 0) {
                System.out.println("여자");
            } else {
                System.out.println("남자");
            }
        }
    }
}
