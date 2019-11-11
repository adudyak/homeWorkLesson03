package homeWorkLesson03;

public class Month extends AbstractMonth {
    /**
     * Constructor
     *
     * @param numOfMonth
     */
    Month(int numOfMonth) {
        super(numOfMonth);
    }

    @Override
    void printPhrase() {
        System.out.println("Allah Babah");
    }
}
