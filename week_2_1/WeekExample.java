package week_2_1;

import java.util.Calendar;

public class WeekExample {
    public static void main(String[] args){
        Week today = null;
        Calendar cal = Calendar.getInstance();

        int week = cal.get(Calendar.DAY_OF_WEEK);

        switch (week){
            case 1: today = Week.SUNDAY;    break;
            case 2: today = Week.MONDAY;    break;
            case 3: today = Week.TUESDAY;    break;
            case 4: today = Week.WEDNESDAY;    break;
            case 5: today = Week.THURSDAY;    break;
            case 6: today = Week.FRIDAY;    break;
            case 7: today = Week.SATURDAY;    break;
        }

        if(today == Week.SUNDAY){
            System.out.println("일요일은 영화를 봅니다.");
        } else {
            System.out.println("공부... 합니다...");
        }
    }
}
