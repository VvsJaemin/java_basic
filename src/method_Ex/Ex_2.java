package method_Ex;

import java.util.Calendar;

public class Ex_2 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        System.out.println(today);

        int year = today.get(Calendar.YEAR);
        System.out.println(year + "년");

        int month = today.get(Calendar.MONTH);
        System.out.println(month+1+"월");

        int date = today.get(Calendar.DATE);
        System.out.println(date + "일");

        int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);
        String yo = "";
        switch (dayOfWeek) {
            case 1 :
                yo = "일요일";
                break;
            case 2:
                yo = "월요일";
                break;
            case 3:
                yo = "화요일";
                break;
            case 4:
                yo = "수요일";
                break;
            case 5:
                yo = "목요일";
                break;
            case 6:
                yo = "금요일";
                break;
            default:
                yo = "토요일";
        }
        System.out.println(yo);

        int endDate = today.getActualMaximum(Calendar.DATE);
        System.out.println((month + 1) + "월달은" + endDate + "일까지 있습니다.");
    }
}
