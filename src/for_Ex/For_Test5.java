package for_Ex;

public class For_Test5 {

    // 두 개의 주사위 합이 6이 나오는 경우의 수와 확률
    public static void main(String[] args) {
        int total = 0;
        int countSix = 0;

        for (int i = 1; i <= 6; i = i + 1) {
            for (int j = 1; j <= 6; j = j + 1) {
                total = total+1;
                if(i+j==6){
                    countSix = countSix+1;
                    System.out.println(i+","+j);
                }

            }

        }
        System.out.println((double) countSix / (double) total *100.0+ "%");

    }
}
