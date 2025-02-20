package kata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MiningRepresentation {

    public static List<String> generate(String path, int time) {
        // Ready to work :)
        List<String> representation = new ArrayList<>();
        Map<Integer, String> currenPathStage = new HashMap<>();
        Map<Integer, String> nextPathStage = new HashMap<>();

        // No Worker
        if (path.matches("M[.]+B")) {
            for (int i = 0; i < time; i++)
                representation.add(path);

            return representation;
        }

        // At least one worker expected: First fill the currenPathStage and the nextPathStage
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == '.')
                currenPathStage.put(i, "");
            else
                currenPathStage.put(i, String.valueOf(path.charAt(i)));
            nextPathStage.put((i), "");
        }

        // Now work the desired times
        for (int t = 0; t < time; t++) {

            // first create a representation for the current path stage and add it to representation list
            StringBuilder currentRepresentation = new StringBuilder();

            currentRepresentation.append(currenPathStage.get(0)); // the mine

            // the path between mine and base
            for (int j = 1; j < path.length() - 1; j++) {
                switch (currenPathStage.get(j).length()) {
                    case 0:
                        currentRepresentation.append(".");
                        break;
                    case 1:
                        currentRepresentation.append(currenPathStage.get(j));
                        break;
                    default:
                        currentRepresentation.append("#");
                        break;
                }
            }

            currentRepresentation.append(currenPathStage.get(path.length() - 1)); // the base

            representation.add(currentRepresentation.toString());


            // Now process the current path stage and figure out the next path stage

            // the mine
            if (currenPathStage.get(0).equals(("*")))
                nextPathStage.put(1, nextPathStage.get(1) + ">");

            nextPathStage.put(0, "M");

            // The base
            if (currenPathStage.get(path.length() - 1).contains("*"))
                nextPathStage.put(path.length() - 2, nextPathStage.get(path.length() - 2) + "<");

            nextPathStage.put(path.length() - 1, "B");

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

            }

            // Now take the next path over as the current path stage for the next loop and generate a clear new next path stage
            currenPathStage = nextPathStage;
            nextPathStage = new HashMap<>();
            for (int i = 0; i < path.length(); i++) {
                nextPathStage.put((i), "");
            }

        }

        // Now it's time to return the representation list
        return representation;
    }

}

// time: fr Feb 7: 60' sat Feb 8: 30-45' thinking about it. Mo Feb 10: 30' + 10' Tue Feb 18: 65' Wed Feb 19: 34' + 28' + 17'
// Thu Feb 20 20'
// all the time: 309' -> 5 h 9'
