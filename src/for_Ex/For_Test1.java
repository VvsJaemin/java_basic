package for_Ex;

public class For_Test1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("i : " + i + "j : " + j);
            }
        }

        // 중첩 반복문을 이용한 구구단 출력
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println(i * j);
            }
        }

        // 구구단을 풀어서
        for (int i = 1; i <= 9; i = i + 1) {
            System.out.println("9*" + i+"="+(9*i));
        }

        // 구구단 전체 패턴 찾기 -> 앞의 수가 2~9(8번) -> 알고리즘
        for (int dan = 2; dan <= 9; dan = dan + 1) {
            for (int i = 1; i <= 9; i = i + 1) {
                System.out.println(dan + "*" + i + "=" + (dan * i));
            }
        }
    }
}
