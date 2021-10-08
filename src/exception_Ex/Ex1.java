package exception_Ex;

public class Ex1 {
    public static void main(String[] args) {
        try {
            int x = 7/0;
        } catch (ArithmeticException e) {
            System.out.println("자바는 무한대값의 표현식이 없습니다.");
            System.out.println("0으로 나누면 예외가 발생합니다.");
            System.out.println("프로그램을 종료하겠습니다.");
        }
    }
}
