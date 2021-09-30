package array_Ex;

public class Ex_5 {
    public static void main(String[] args) {
        String[] pirate = new String[5];
        pirate[0] = "루피";
        pirate[1] = "조로";
        pirate[2] = "나미";
        pirate[3] = "상디";
        pirate[4] = "쵸파";

        System.out.println(pirate[0]);
        System.out.println(pirate[1]);
        System.out.println(pirate[2]);
        System.out.println(pirate[3]);
        System.out.println(pirate[4]);

        for (int i = 0; i <= 5; i++) {
            System.out.println(pirate[i]);
        }

        for (String s : pirate) { // for(배열하나의 데이터 타입 : 배열이름)
            System.out.println(s);
        }
    }
}
