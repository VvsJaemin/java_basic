package for_Ex;

public class For_Ex2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i += i) {
            sum = sum + (i + 1);
        }

        System.out.println(sum);
    }
}
