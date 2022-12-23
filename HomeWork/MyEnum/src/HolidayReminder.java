public class HolidayReminder {
    public void printHolidays(Month month) {

        switch (month) {

            case JANUARY:
                System.out.println("7 января Рождество!");
                break;
            case FEBRUARY:
                System.out.println("В феврале День Защитника Отечества - 23 февраля!");
                break;
            case MARCH:
                System.out.println("В марте Всемирный Женский День - 8 марта!");
                break;
            case MAY:
                System.out.println("В мае отмечаются - 1 и 9 мая!");
                break;
        }
    }
}
