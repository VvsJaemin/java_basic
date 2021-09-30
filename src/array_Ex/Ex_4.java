package array_Ex;

public class Ex_4 {
    public static void main(String[] args) {
        String [] strawHat = null;
        strawHat = new String[6];
        strawHat[0] = "루피";
        strawHat[1] = "조로";
        strawHat[2] = "나미";
        strawHat[3] = "우솝";
        strawHat[4] = "상디";
        strawHat[5] = "쵸파";

        int i = 0;
        while (i <= 6) {
            System.out.println(strawHat[i]);
            i = i + 1;
        }

        for (int j = 0; j < strawHat.length; j++) {

            System.out.println(strawHat[i]);
        }
    }
}
