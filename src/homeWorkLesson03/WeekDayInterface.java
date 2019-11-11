package homeWorkLesson03;

/**
 * Interface
 */
public interface WeekDayInterface {

    /**
     *
     */
    void printPhrase();

    /**
     *
     * @param numOfDay
     * @return String of day
     */
    String returnDayNameByNum(int numOfDay);

    /**
     *
     * @param name
     * @return int of Day
     */
    int returnDayNumByName(String name);
}
