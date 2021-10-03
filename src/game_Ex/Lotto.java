package game_Ex;

public class Lotto {
    public static void main(String[] args) {
        int[] ball = new int[45];

        // 1~45 초기화
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }

        for (int i = 0; i < 10000; i++) {
            int r = (int) (Math.random() * ball.length);
            System.out.println("r : " + r);
            int temp = ball[0];
            System.out.println("temp : " + temp);
            ball[0] = ball[r];
            System.out.println("ball[0] : " + ball[0]);
            ball[r] = temp;
            System.out.println("ball[r] : " + ball[r]);

        }

        for (int i = 0; i < 6; i++) {
            System.out.println(ball[i]);
        }
    }
}
