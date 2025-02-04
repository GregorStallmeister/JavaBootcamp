public class Fibonacci {

    public long getFibonacciNumberAtPosition(int position) {
        long number = 0;
        long prevNumber = 0;

        if (position > 0)
            number = 1;

        if (position == 1)
            return number;

        for (int i = 0; i <= position; i++) {
            long tempNumber = number;

            number = number + prevNumber;
            prevNumber = tempNumber;
        }

        return number;
    }
}
