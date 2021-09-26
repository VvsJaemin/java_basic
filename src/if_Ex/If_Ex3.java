package if_Ex;

public class If_Ex3 {

    public static void main(String[] args) {

        // 1. 100명의 1번부터 50번까지의 학생이 있다.
        // 2. 1팀의 10명씩 팀을 구성(1~10, 11~20, 21~30, 31~40, 41~50)
        // 3. 가족의 1, 11, 21, 31, 41번 학생이 팀장

        int myNum = 10;

        int leaderNum = 0;

        if (myNum % 10 == 0) {
            leaderNum = ((myNum / 10) - 1) * 10 + 1;
        } else {
            leaderNum = myNum / 10 * 10 + 1;
        }

        System.out.println(myNum + "번 학생의 팀장 번호는 " + leaderNum + "입니다.");
    }
}
