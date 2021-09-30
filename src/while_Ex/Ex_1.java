package while_Ex;

import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        // 숫자 맞추기 게임

        double num = Math.random();
        num = num * 100;
        num = num + 1;
        int num2 = (int) num;

        int count =0;
        Scanner s = new Scanner(System.in);

        for (; ; ) { // 무한반복
            count = count + 1;
            System.out.println("숫자를 입력하세요");
            int myNum = s.nextInt();
            if (myNum == num2) {
                System.out.println("게임종료 : " + count);
                break;
            } else if (myNum > num2) {
                System.out.println("입력한 수가 크다");
            }else{
                System.out.println("입력한 수가 적다");
            }

        }
    }
}
