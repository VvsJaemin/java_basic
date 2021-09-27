package switch_Ex;

public class Switch_Ex1 {
    // switch문은 if-else 문과 유사
    // switch문은 표현식의 값을 평가 하여 그 값에 해당되는 case 라벨로 이동
    // 표현식은 정수형이나 String 값 이어야한다.
    public static void main(String[] args) {
        //if문과 차이
        // if문 : 조건을 가지고 분기 -> 참 / 거짓
        // switch문 : 값으로 분기
        // 단순 정수값이나 스트링 값을 비교한다면 모든 조건을 검사하는 else if 보다 결과 case만 찾는 switch문이 속도가 빠름.

        int today = 5;

        switch (today) {
            case 1: // today값이 1이면
                System.out.println("오늘은 월요일 입니다.");
                break; // switch블럭을 탈출하는 실행문
            case 2:
                System.out.println("오늘은 화요일 입니다.");
                break;
            case 3:
                System.out.println("오늘은 수요일 입니다.");
                break;
            case 4:
                System.out.println("오늘은 목요일 입니다.");
                break;
            case 5:
                System.out.println("오늘은 금요일 입니다.");
                break;
            case 6:
                System.out.println("오늘은 토요일 입니다.");
                break;
            case 7:
                System.out.println("오늘은 일요일 입니다.");
                break;
            default: // if의 else구문과 비슷
                System.out.println("잘못 입력하셨습니다.");
        }

        //switch문을 if로 변경
        if(today == 1) {
            System.out.println("오늘은 월요일 입니다.");
        } else if(today == 2) {
            System.out.println("오늘은 화요일 입니다.");
        } else if(today == 3) {
            System.out.println("오늘은 수요일 입니다.");
        } else if(today == 4) {
            System.out.println("오늘은 목요일 입니다.");
        } else if(today == 5) {
            System.out.println("오늘은 금요일 입니다.");
        } else if(today == 6) {
            System.out.println("오늘은 토요일 입니다.");
        } else if(today == 7) {
            System.out.println("오늘은 일요일 입니다.");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }
}
