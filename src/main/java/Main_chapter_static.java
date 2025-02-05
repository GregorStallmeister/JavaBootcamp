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
    }
}
