package method_Ex;

public class Ex_1 {
    public static void main(String[] args) {
        MyMethod m = new MyMethod();
        m.greet();

        m.greet(10);
        m.add(10, 20);

        int result = m.add2(7, 8);
        System.out.println(result);

        boolean result2 = m.login("admin", "1234");
        System.out.println(result2);

        if (result2 == true) {
            System.out.println("로그인 성공");
        }else{
            System.out.println("로그인 실패");
        }

        int[] myPaper = {1, 2, 1, 1, 3, 1, 4, 2, 2, 3};
        int myScore = m.grade(myPaper);
        System.out.println(myScore + "점");
    }
}
