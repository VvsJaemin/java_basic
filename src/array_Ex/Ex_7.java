package array_Ex;

public class Ex_7 {
    public static void main(String[] args) {
        int dice1 = (int) (Math.random() * 6+1);
        int dice2 = (int) (Math.random() * 6+1);
        System.out.println(dice1+dice2);

        int [] dice = new int[3];
        dice[0] = (int) (Math.random() * 6 + 1);
        dice[1] = (int) (Math.random() * 6 + 1);
        dice[2] = (int) (Math.random() * 6 + 1);
        System.out.println(dice[0]+dice[1]+dice[2]);

        int[] d = new int[3];
        for (int i = 0; i < d.length; i++) {
            d[i] = (int) (Math.random() * 6 + 1);
        }
        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum += d[i];
        }

        System.out.println(sum);

    }
}
