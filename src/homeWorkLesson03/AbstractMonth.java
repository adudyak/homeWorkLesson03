package homeWorkLesson03;

public abstract class AbstractMonth {
    public enum MonthsEnum {
        /**
         * Values for months
         */
        JANUARY("January", 1),
        FEBRUARY("February", 2),
        MARCH("March", 3),
        APRIL("April", 4),
        MAY("May", 5),
        JUNE("June", 6),
        JULY("July", 7),
        AUGUST("August", 8),
        SEPTEMBER("September", 9),
        OCTOBER("October", 10),
        NOVEMBER("November", 11),
        DECEMBER("December", 12);

        /**
         * Gets name of months
         *
         * @return
         */
        public String getNameOfMonth() {
            return nameOfMonth;
        }

        private String nameOfMonth;
        private int numOfMonth;

        /**
         * Constructor
         *
         * @param nameOfMonth
         * @param numOfMonth
         */
        MonthsEnum(String nameOfMonth, int numOfMonth) {
            this.nameOfMonth = nameOfMonth;
            this.numOfMonth = numOfMonth;
        }
    }

    /**
     * Constructor
     *
     * @param numOfMonth
     */

    AbstractMonth(int numOfMonth) {
    }

    public String getMonthNameByNum(int numOfMonth) {
        String stringResult;
        switch (numOfMonth) {
            case 1:
                stringResult = MonthsEnum.JANUARY.getNameOfMonth();
                break;
            case 2:
                stringResult = MonthsEnum.FEBRUARY.getNameOfMonth();
                break;
            case 3:
                stringResult = MonthsEnum.MARCH.getNameOfMonth();
                break;
            case 4:
                stringResult = MonthsEnum.APRIL.getNameOfMonth();
                break;
            case 5:
                stringResult = MonthsEnum.MAY.getNameOfMonth();
                break;
            case 6:
                stringResult = MonthsEnum.JUNE.getNameOfMonth();
                break;
            case 7:
                stringResult = MonthsEnum.JULY.getNameOfMonth();
                break;
            case 8:
                stringResult = MonthsEnum.AUGUST.getNameOfMonth();
                break;
            case 9:
                stringResult = MonthsEnum.SEPTEMBER.getNameOfMonth();
                break;
            case 10:
                stringResult = MonthsEnum.OCTOBER.getNameOfMonth();
                break;
            case 11:
                stringResult = MonthsEnum.NOVEMBER.getNameOfMonth();
                break;
            case 12:
                stringResult = MonthsEnum.DECEMBER.getNameOfMonth();
                break;
            default:
                stringResult = null;
        }
        return stringResult;
    }

    /**
     * prints phrase
     */
    abstract void printPhrase();
}
