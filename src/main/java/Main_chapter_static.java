import chapter_static.Calculator;
import chapter_static.Counters;

public class Main_chapter_static {
    public static void main(String[] args) {
        Counters myCounters1 = new Counters(0);
        Counters myCounters2 = new Counters(42);
        Counters myCounters3 = new Counters(84);

        System.out.println(myCounters1);
        System.out.println(myCounters2);
        System.out.println(myCounters3);

        Counters.incrementTotalCount();
        Counters.incrementTotalCount();
        Counters.incrementTotalCount();

        myCounters1.incrementInstanceCount();
        myCounters1.incrementInstanceCount();
        myCounters1.incrementInstanceCount();
        myCounters1.incrementInstanceCount();

        myCounters3.incrementInstanceCount();

        System.out.println();
        System.out.println(myCounters1);
        System.out.println(myCounters2);
        System.out.println(myCounters3);

        System.out.println();
        System.out.println("Calculator operations");
        System.out.println();

        System.out.println("33 + 9 = " + Calculator.add(33, 9));
        System.out.println("75 - 33 = " + Calculator.subtract(75, 33));
        System.out.println("6 * 7 = " + Calculator.multiply(6, 7));
        System.out.println("420 / 10 = " + Calculator.divide(420, 10));
    }
}
