package switch_Ex;

public class Ex2 {
    public static void main(String[] args) {
        int currentYear = 2024;

        if (currentYear % 400 == 0) {
            System.out.println(currentYear + "는 윤년입니다.");
        } else {
            if (currentYear % 100 != 0) {
                if (currentYear % 4 == 0) {
                    System.out.println(currentYear + "년은 윤년입니다.");
                }else{
                    System.out.println(currentYear +"년은 평년입니다.");
                }
            }else{
                System.out.println(currentYear+"년은 평년입니다.");
            }
        }

        if (currentYear % 400 == 0) {
            System.out.println(currentYear + "년은 윤년입니다.");
        }else{
            if ((currentYear % 100 != 0) && (currentYear % 4 == 0)) {
                System.out.println(currentYear + "년은 윤년입니다.");
            }else{
                System.out.println(currentYear + "년은 평년입니다.");
            }
        }

        if ((currentYear % 400 == 0) || (currentYear % 100 != 0) && (currentYear % 4 == 0)) {
            System.out.println(currentYear + "년은 윤년입니다. ");
        }else{
            System.out.println(currentYear + "년은 평년입니다.");
        }
    }
}
