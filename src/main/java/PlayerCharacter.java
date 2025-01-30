public class PlayerCharacter {
    private static int y = 0;

    public static int getX() {
        return 0;
    }

    public static int getY() {
        return y;
    }

    public static void move(String key) {
        switch (key) {
            case "W" : y++;
            break;
        }
    }
}
