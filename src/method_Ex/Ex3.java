package method_Ex;

import java.util.Calendar;

public class Ex3 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        int y = c.get(Calendar.YEAR);
        int m = c.get(Calendar.MONTH)+1;
        int d = c.get(Calendar.DATE);

        int beginDate = 1;
        int endDate = c.getActualMaximum(Calendar.DATE);

        System.out.println(y+"년" + m + "월");
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        for (int i = beginDate; i <= endDate; i++) {
            if (i == d) {
                System.out.println("["+i+"]\t");
            }else{
                System.out.println(i+"\t");
            }

            if (i % 7 == 0) {
                System.out.println("");
            }
        }
    }
}
