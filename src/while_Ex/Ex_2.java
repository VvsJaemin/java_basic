package while_Ex;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        while (true) {
            System.out.println("1.새파일");
            System.out.println("2.파일열기");
            System.out.println("3.저장");
            System.out.println("4.종료");

            Scanner s = new Scanner(System.in);
            int menu = s.nextInt();

            if (menu == 1) {
                System.out.println("1. 새파일을 선택하셨습니다.......");
            } else if (menu == 2) {
                System.out.println("2. 파일열기를 선택하셨습니다.......");
            } else if (menu == 3) {
                System.out.println("3. 저장을 선택하셨습니다.......");
            } else if (menu == 4) {
                System.out.println("종료");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
