package array_Ex;

import java.util.Scanner;

public class Ex_6 {
    public static void main(String[] args) {
        int comNum = (int) (Math.random() * 3);

        String[] comRsp = {"가위", "바위", "보"};
        String com = comRsp[comNum];

        System.out.println("가위 바위 보 입력해주세요");
        Scanner s = new Scanner(System.in);
        String me = s.nextLine();


        if (com.equals(me)) { // equals()는 com과 me가 가리키는 문자열이 같으면 true 틀리면 false
            System.out.println("비겼다");
            System.out.println("컴퓨터의 선택 : " + com);
            System.out.println("나의 선택 : " + me);
        } else if ((me.equals("주먹") && com.equals("가위")) || (me.equals("가위") && com.equals("보")) || (me.equals("보") && com.equals("주먹"))) {
            System.out.println("내가 이겼다");
            System.out.println("컴퓨터의 선택 : " + com);
            System.out.println("나의 선택 : " + me);
        } else if ((com.equals("주먹") && me.equals("가위")) || (com.equals("가위") && me.equals("보")) || (com.equals("보") && me.equals("주먹"))) {
            System.out.println("컴퓨터가 이겼다");
            System.out.println("컴퓨터의 선택 : " + com);
            System.out.println("나의 선택 : " + me);
        } else {
            System.out.println("잘못 입력했습니다. 가위 바위 보 중 하나를 입력하세요.");
        }
    }

}
