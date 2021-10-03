package method_Ex;

public class MyMethod {
    public void greet() {
        System.out.println("hello");
    }

    public void greet(int time) {
        if (time < 12) {
            System.out.println("good morning");
        } else if (time < 18) {
            System.out.println("good afternoon");
        } else {
            System.out.println("good evening");
        }
    }

    public void add(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public int add2(int a, int b) {
        int c = a + b;
        return c;
    }

    public boolean login(String id, String pw) {
        String sysId = "admin";
        String sysPw = "1234";

        if (sysId.equals(id) && sysPw.equals(pw)) {
            return true;
        } else {
            return false;
        }
    }

    public int grade(int[] paper) {
        int score = 0;
        int[] answer = {3, 2, 1, 1, 4, 1, 4, 2, 2, 3};

        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == paper[i]) {
                score += 10;
            }
        }
        return score;
    }
}
