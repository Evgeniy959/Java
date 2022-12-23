import java.util.Arrays;

public class DaysCount {
    private Month month;

    public void setMonth(Month month) {
        this.month = month;
    }

    public void printDaysCount() {
        System.out.println(month.getName()+" количество дней-"+month.getDaysCount());
    }

}
