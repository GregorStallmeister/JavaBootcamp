public class Fibonacci {

    public int getFibonacciNumberAtPosition(int position) {
        int number = 0;
        int prevNumber = 0;

        if (position > 0)
            number = 1;

        if (position == 1)
            return number;

        for (int i = 0; i <= position; i++) {
            int tempNumber = number;

            number = number + prevNumber;
            prevNumber = tempNumber;
        }

        return number;
    }
}
