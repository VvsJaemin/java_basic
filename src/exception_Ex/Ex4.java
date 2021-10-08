package exception_Ex;

public class Ex4 {
    public static void main(String[] args) {
        try {
            int num = 7 / 0; // num에는 무한대값(?)이 대입 -> 자바에는 무한대값 표현식 X -> 실행시 ArithmeticException 발생
            // throw new ArithmeticException();
            // 자바는 에러(예외)발생시 에러(예외)타입의 객체를 메모리에 생성한 후 시스템에 throw한다 -> 강제종료
        } catch (Exception e) { // catch구문은 try구문에서 발생(throw)하는 예외의 객체를 매개변수값을 받는다
            // Exception e : 매개변수 다형성 어떤 예외 객체도 받을 수 있다
            // e.printStackTrace(); // 강제종료시 출력되는 메세지를 출력 -> 예외메세지 디버깅 코드 대신 -> 배포시에는 주석처리
            System.out.println("0으로 나누면 예외가 발생합니다");
            // 예외자체를 막는다라기보다는 예외 이후에 대처할 코드를 진행할 수 있다.
            // 강제종료코드 추가
            boolean flag = true;
            if (flag) {
                return; // 메인메서드를 종료하는 강제종료 코드 -> finally구문의 코드는 실행된다.
            }

        } finally { // finally 구문은 정상코드이던 예외발생코드이던 무조건 실행되는 구문
            System.out.println("프로그램을 종료하겠습니다."); // catch구문에서 return문을 실행해도 finally구문은 실행된다.
        }
        // 예외처리 이후에 진행될 코드 구현
        System.out.println("예외발생이후 진행될 코드");
    }

    // 에러 : 강제종료를 막을 수 없다.
    // 예외 : 강제종료를 막을 수는 없지만 대처할 수는 있다. -> try...catch
}

