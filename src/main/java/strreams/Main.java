package strreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 42; i > 0; i--)
            numbers.add(i);

        System.out.println();
        System.out.println("All numbers: ");
        numbers.forEach(number -> System.out.print(number + " "));

        List<Integer> evenNumbers = numbers.stream().filter(integer -> integer % 2 == 0).toList();
        System.out.println();
        System.out.println("Even numbers only:");
        evenNumbers.stream().forEach(number -> System.out.print(number + " "));

        List<Integer> doubledNumbers = evenNumbers.stream().toList().stream().map(number -> number * 2).toList();
        System.out.println();
        System.out.println("Doubled: ");
        doubledNumbers.forEach(number -> System.out.print(number + " "));

        List<Integer> sortedAscending = doubledNumbers.stream().sorted().toList();
        System.out.println();
        System.out.println("Sorted ascending: ");
        sortedAscending.forEach(number -> System.out.print(number + " "));

//        Integer sum = sortedAscending.stream().reduce(0, (subtotal, element) -> subtotal + element);
        Integer sum = sortedAscending.stream().reduce(0, Integer::sum);
        int exampleSum = Integer.sum(19, 23);
        System.out.println();
        System.out.println("Sum: ");
        System.out.println(sum);

        System.out.println();
        System.out.println("As much as possible in one: ");
        // All in one is not possible:
//        List<Integer> result = numbers.stream()
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .sorted()
//                .reduce(0, Integer::sum) // "produces" an Integer, so  no more stream operations possible.
                .forEach(number -> System.out.print(number + " "));  // forEach is a terminating operation, so...
//                . no more operations possible, especially no converting into a list

        List<String> lines = new ArrayList<>();
        try {
            Stream<String> linesFromReading = Files.lines(Path.of("students.csv"));
            lines = linesFromReading.toList();
        } catch (IOException e) {
            System.out.println("Error: " + e.toString());
            ;
        }

        System.out.println();
        System.out.println();
        System.out.println("Students raw: ");
        lines.forEach(System.out::println);

        System.out.println();
        System.out.println("Students filtered and converted to \"real\" students: ");
        lines.stream()
                .skip(Long.valueOf("1"))
                .distinct()
                .filter(line -> !line.equals(""))
                .map(line -> new Student(
                                line.split(",")[0],
                                line.split(",")[1],
                                line.split(",")[2],
                                Integer.valueOf(line.split(",")[3]))
                )
                .forEach(student -> System.out.println(student));
    }
}
