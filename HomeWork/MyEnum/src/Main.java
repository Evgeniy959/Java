import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Month.getWinterMonths()));
        HolidayReminder reminder = new HolidayReminder();
        reminder.printHolidays(Month.JANUARY);
        DaysCount daysCount = new DaysCount();
        daysCount.setMonth(Month.AUGUST);
        daysCount.printDaysCount();
    }
}