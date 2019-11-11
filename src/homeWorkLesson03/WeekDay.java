package homeWorkLesson03;

/**
 * Class to play with Enum
 */
public class WeekDay implements WeekDayInterface {
    /**
     * Prints some phrase
     */
    @Override
    public void printPhrase() {
        System.out.println("Hard rock hallelujah");
    }

    /**
     * Returns day's name by number
     *
     * @param numOfDay
     * @return String name of the day
     */
    @Override
    public String returnDayNameByNum(int numOfDay) {
        String stringResult;
        switch (numOfDay) {
            case 1:
                stringResult = WeekDayEnum.MONDAY.getName();
                break;
            case 2:
                stringResult = WeekDayEnum.TUESDAY.getName();
                break;
            case 3:
                stringResult = WeekDayEnum.WEDNESDAY.getName();
                break;
            case 4:
                stringResult = WeekDayEnum.THURSDAY.getName();
                break;
            case 5:
                stringResult = WeekDayEnum.FRIDAY.getName();
                break;
            case 6:
                stringResult = WeekDayEnum.SATURDAY.getName();
                break;
            case 7:
                stringResult = WeekDayEnum.SUNDAY.getName();
                break;
            default:
                stringResult = null;
        }
        return stringResult;
    }

    /**
     * Return's day's number by name
     *
     * @param nameOfDay
     * @return int number of the day
     */
    @Override
    public int returnDayNumByName(String nameOfDay) {
        int intResult;
        switch (nameOfDay) {
            case "Monday":
                intResult = WeekDayEnum.MONDAY.getNumber();
                break;
            case "Tuesday":
                intResult = WeekDayEnum.TUESDAY.getNumber();
                break;
            case "Wednesday":
                intResult = WeekDayEnum.WEDNESDAY.getNumber();
                break;
            case "Thursday":
                intResult = WeekDayEnum.THURSDAY.getNumber();
                break;
            case "Friday":
                intResult = WeekDayEnum.FRIDAY.getNumber();
                break;
            case "Saturday":
                intResult = WeekDayEnum.SATURDAY.getNumber();
                break;
            case "Sunday":
                intResult = WeekDayEnum.SUNDAY.getNumber();
                break;
            default:
                intResult = 0;
        }
        return intResult;
    }
}
