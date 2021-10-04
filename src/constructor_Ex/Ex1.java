package constructor_Ex;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Function.hi();

        // 생성자 메서드 사용 ->  new 연산자와 함께 객체를 만들고 초기화
        Function f = new Function();

        //일반 메서드 사용 -> 객체 변수 참조를 통해서 호출
        f.hello();

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        double rNum = Math.random();
    }
}
