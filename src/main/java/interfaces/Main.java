package interfaces;

public class Main {
    public static void main(String[] args) {

        Playable playable1 = new MusicPlayer();
        Playable playable2 = new VideoPlayer();
        MediaController mediaController = new MediaController();

        mediaController.playMedia(playable1);
        System.out.println();
        mediaController.playMedia(playable2);
    }
}
