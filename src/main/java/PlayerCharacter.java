public class PlayerCharacter {
    private static int y = 0;
    private static int x = 0;

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static void move(String key) {
        switch (key) {
            case "W" :
                y++;
                break;

            case "S" :
                y--;
                break;

            case "D" :
                x++;
                break;

            case "A" :
                x--;
                break;
        }
    }
}
