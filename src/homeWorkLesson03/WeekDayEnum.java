package homeWorkLesson03;

public enum WeekDayEnum {
    /**
     * Values for days of week
     */
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    private String name;
    private int number;

    /**
     * Constructor
     *
     * @param name
     * @param number
     */
    WeekDayEnum(String name, int number) {
        this.name = name;
        this.number = number;
    }

    /**
     * Getter of day's name
     *
     * @return String of day
     */
    public String getName() {
        return name;
    }

    /**
     * Getter of day's number
     *
     * @return int of day
     */
    public int getNumber() {
        return number;
    }
}