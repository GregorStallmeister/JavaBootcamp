package kata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MiningRepresentation {

    public static List<String> generate(String path, int time) {
        // Ready to work :)
        List<String> representation = new ArrayList<String>();
        Map <Integer, String> currenPathStage = new HashMap<Integer, String>();
        Map <Integer, String> nextPathStage = new HashMap<Integer, String>();

        // No Worker
        if (path.matches("M[\\.]+B")) {
            for (int i = 0; i < time; i++)
                representation.add(path);
        }

        // At least one worker expected: First fill the currenPathStage and the nextPathStage
        for (int i = 0; i < path.length(); i++) {
            currenPathStage.put(i, "\"" + path.charAt(i)+ "\"");
            nextPathStage.put((i), "");
        }

        // The Mine
        if (currenPathStage.get(0).equals(("*"))) {
            nextPathStage.put(1, nextPathStage.get(1) + ">");
            nextPathStage.put(0, "M");
        }
        else
            nextPathStage.put(0, "M");

        // The path between mine and base
        for (int i = 1; i < path.length() - 1; i++) {
            while (currenPathStage.get(i).contains("<")) {
                nextPathStage.put(i - 1, nextPathStage.get(i - 1) + "<");
                currenPathStage.put(i, currenPathStage.get(i).replaceFirst("<", ""));

                if (i == 1) // at index 0 is the mine, and already a worker is in it!
                    break;
            }


        }

        return representation;
    }

}

// time: sat 30-45' thinking about it. Mo 30' + 10'
