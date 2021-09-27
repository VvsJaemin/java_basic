package for_Ex;

public class For_test2 {
    public static void main(String[] args) {

        for (int i = 1; i < 51; i++) {
            if (i % 5 == 0) {
                System.out.println(i+"\t");
            }
        }

        int y = 0;
        for (int i = 1; i < 11; i++) {
            if (i % 2 == 1) {
                System.out.print(i+"\t");
                y+=i;
                System.out.println(y+"\t");
            }
        }
        System.out.println(y);

        for (int i = 1; i <= 50; i = i + 1) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

        int oddSum =0;
        int evenSum = 0;

        for (int i = 1; i <= 10; i = i + 1) {
            if (i % 2 == 1) {
                oddSum = oddSum + i;
            } else {
                evenSum = evenSum + i;
            }
        }

        System.out.println("홀수의 합(sum) : " + oddSum );
        System.out.println("짝수의 합(sum) : " + evenSum );
    }
}
