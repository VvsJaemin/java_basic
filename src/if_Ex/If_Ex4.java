package if_Ex;

public class If_Ex4 {

    public static void main(String[] args) {
        String pn = "988525-1112222";

        String num7 = pn.substring(7, 8);

        int num = Integer.parseInt(num7);

        if (num % 2 == 0) {
            System.out.println("여자");
        } else {
            System.out.println("남자");
        }
    }
}
