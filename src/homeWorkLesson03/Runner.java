package homeWorkLesson03;

public class Runner {
    public static void main(String[] args) {
        WeekDay weekDay = new WeekDay();
        System.out.println(weekDay.returnDayNameByNum(1));
        System.out.println(weekDay.returnDayNumByName("Tuesday"));
        weekDay.printPhrase();

        Month month = new Month(1);
        System.out.println(month.getMonthNameByNum(2));
        month.printPhrase();
    }
}
