package kata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MiningRepresentation {

    public static List<String> generate(String path, int time) {
        // Ready to work :)
        List<String> representations = new ArrayList<String>();
        Map <Integer, String> currenPathStage = new HashMap<Integer, String>();
        Map <Integer, String> nextPathStage = new HashMap<Integer, String>();

        // No Worker
        if (path.matches("M[\\.]+B")) {
            for (int i = 0; i < time; i++)
                representations.add(path);

            return representations;
        }

        // At least one worker expected: First fill the currenPathStage and the nextPathStage
        for (int i = 0; i < path.length(); i++) {
            currenPathStage.put(i, "\"" + path.charAt(i) + "\"");
            nextPathStage.put((i), "");
        }

        for (int t = 0; t < time; t++) {
            // Now work the appropriate times

            // first create a representation for the current path stage
            StringBuilder currentRepresentation = new StringBuilder();

            currentRepresentation.append("\\[");
            currentRepresentation.append(currenPathStage.get(0));
            for (int j = 1; j < path.length() - 1; j++) {
                if (currenPathStage.get(j).length() == 1)
                    currentRepresentation.append(currenPathStage.get(j));
            }
            currentRepresentation.append(currenPathStage.get(path.length() - 1));
            currentRepresentation.append("\\]");

            representations.add(currentRepresentation.toString());

            // The Mine
            if (currenPathStage.get(0).equals(("*"))) {
                nextPathStage.put(1, nextPathStage.get(1) + ">");
                nextPathStage.put(0, "M");
            } else
                nextPathStage.put(0, "M");

            // The path between mine and base
            for (int i = 1; i < path.length() - 1; i++) {
                while (currenPathStage.get(i).contains("<")) {
                    nextPathStage.put(i - 1, nextPathStage.get(i - 1) + "<");
                    currenPathStage.put(i, currenPathStage.get(i).replaceFirst("<", ""));

                    if (i == 1) {
                        nextPathStage.put(0, "*");
                        break; // at index 0 is the mine, and now already a worker is in it!
                    }
                }

                while (currenPathStage.get(i).contains(">")) {
                    nextPathStage.put(i + 1, nextPathStage.get(i + 1) + ">");
                    currenPathStage.put(i, currenPathStage.get(i).replaceFirst(">", ""));

                    if (i == path.length() - 2) {
                        nextPathStage.put(path.length() - 1, "*");
                        break; // at the next index is the base, and now already a worker is in it!
                    }
                }

                // The Base
                if (currenPathStage.get(path.length() - 1).contains("*")) {
                    nextPathStage.put(path.length() -2, nextPathStage.get(path.length() - 2) + "<");
                    nextPathStage.put(path.length() -1, "B");
                } else
                    nextPathStage.put(path.length() -1, "B");

            }

        }

        return representations;
    }

}

// time: fr Feb 7: 60' sat Feb 8: 30-45' thinking about it. Mo Feb 10: 30' + 10' Tue Feb 18:
