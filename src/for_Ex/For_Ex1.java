package for_Ex;

public class For_Ex1 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println( "hello" + i + "번");
        }

        int sum = 0;
        sum = sum + 1;
        sum = sum + 2;
        sum = sum + 3;
        sum = sum + 4;
        sum = sum + 5;

        System.out.println("sum : " + sum);

        int sum2 = 0;
        int num = 1;

        for (int i = 0; i < 5; i += 1) {
            sum2 = sum2 + num;
            num = num + 1;
        }

        System.out.println("sum2 : " + sum2);

        int sum3 = 0;
        for (int i = 1; i <= 5; i += i) {
            sum3 = sum3 + i;
        }
        System.out.println("sum3 : " + sum3);
    }
}
