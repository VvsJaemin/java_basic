package for_Ex;

public class For_Ex3 {
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);

        // 패턴 -> 식 -> 알고리즘 -> 자료 구조

        // 2)
        for (int i = 0; i < 10; i = i + 2) {
            System.out.println(i);
        }

        // 1), 2)과 상관없이 판단기준이 코드에 없음

        //3) 판단식(기준)을 코드에 추가
        for (int i = 0; i < 10; i = i + 1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // 짝수 출력 다른 방식
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 1) {
                continue; // 코드를 더이생 진행하지 않고 반복의 다음 순서로 바로 건너띄는 명령문
            }
            System.out.println(i);
        }

        // 변수 n의 약수 출력
        int n = 10;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }

        // break는 조건이나 순환문을 빠져나오는 용도
        // continue는 반복에서 다음 단계로 진행하는데 사용
    }


}
