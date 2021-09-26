package if_Ex;

public class If_Ex2 {

    public static void main(String[] args) {
        String id = "test";

        String pw = "test";

        String userId = "test1";

        String userPw = "test1";

        if (id == userId) {
            if (pw == userPw) {
                System.out.println("로그인 성공");
            }else{
                System.out.println("로그인 실패(비밀번호를 확인해주세요");
            }
        }else{
            System.out.println("로그인 실패(아이디를 확인해주세요");
        }

        if (id == userId && pw == userPw) {
            System.out.println("로그인 성공");
        }else{
            System.out.println("로그인 실패");
        }
    }
}
