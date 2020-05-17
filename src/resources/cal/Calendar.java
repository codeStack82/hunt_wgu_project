package resources.cal;
import java.time.*;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Locale;

public class Calendar {

    public static void main(String[] args){

        //ArrayList for calendar dates
        ArrayList<LocalDate> calMonthDates = new ArrayList<LocalDate>();
        ArrayList<LocalDate> calWeekDates = new ArrayList<LocalDate>();

        // Date Objects: today, calendar days, start of calendar day
        LocalDateTime today = LocalDateTime.now();
        LocalDate calendar_Dates = LocalDate.now();
        LocalDate startMonthCal = calendar_Dates.with(WeekFields.of(Locale.US).dayOfWeek(), 1L).minusDays(7);
        LocalDate startWeekCal = calendar_Dates.with(WeekFields.of(Locale.US).dayOfWeek(), 1L);

        // Calendar month view
        System.out.println("Month Calendar dates");
        for(int i = 0; i < 42; i++){
            calMonthDates.add(startMonthCal.plusDays(i));
            System.out.println(startMonthCal.plusDays(i) + " " + startMonthCal.plusDays(i).getDayOfWeek());
        }

        // Calendar week view
        System.out.println("\nWeek Calendar dates");
        for(int i = 0; i < 7; i++){
            calWeekDates.add(startWeekCal.plusDays(i));
            System.out.println(startWeekCal.plusDays(i) + " " + startWeekCal.plusDays(i).getDayOfWeek());
        }

        //lambda print
//        cal_Dates.forEach(System.out::println);

    }


}
