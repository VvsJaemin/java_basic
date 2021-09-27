package for_Ex;

public class For_Test3 {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 2014; i <= 2500; i = i + 1) {
            if (i % 400 == 0 || ((i % 4 == 0) && (i % 100 != 0))) {
                count = count + 1;
                System.out.println(i);
            }
        }

        System.out.println("윤년은"+count+"번 입니다.");
    }
}
