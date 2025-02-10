package kata;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MiningRepresentationTest {

    public static void main(String[] args) {
        MiningRepresentation.generate("M..<..B", 12);
    }

    @Test
    public void testNoWorker() {
        String input = "M.......B";
        int n = 5;
        List<String> expected = List.of(
                "M.......B",
                "M.......B",
                "M.......B",
                "M.......B",
                "M.......B"
        );

        List<String> actual = MiningRepresentation.generate(input, n);
        Assertions.assertEquals(expected, actual);
    }


}
