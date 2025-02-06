package interfaces;

public class Main {
    public static void main(String[] args) {

        Playable playable1 = new MusicPlayer();
        Playable playable2 = new VideoPlayer();
        MediaController mediaController = new MediaController();

        mediaController.playMedia(playable1);

        long startMilliSec = System.currentTimeMillis();
        while (true) {
            long currentMilliSec = System.currentTimeMillis();

            if (currentMilliSec - startMilliSec >= 10000)
                break;
        }

        ((MusicPlayer)playable1).quitPlaying();

        System.out.println();
        mediaController.playMedia(playable2);
    }
}
