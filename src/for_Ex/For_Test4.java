package for_Ex;

public class For_Test4 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i = i + 1) {
            for (int j = 0; j < 5; j = j + 1) {
                if (i >= j) {
                    System.out.println("*");
                }else{
                    System.out.println("");
                }
            }
            System.out.println();
        }
    }
}
