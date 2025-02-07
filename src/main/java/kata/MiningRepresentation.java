package kata;

import java.util.ArrayList;
import java.util.List;

public class MiningRepresentation {

    public static List<String> generate(String path, int time) {
        // Ready to work :)
        List<String> representation = new ArrayList<String>();;

        // No Worker
        if (path.matches("M[\\.]+B")) {
            for (int i = 0; i < time; i++)
                representation.add(path);
        }
        return representation;
    }

}
