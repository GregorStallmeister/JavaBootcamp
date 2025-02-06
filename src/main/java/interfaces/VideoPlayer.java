package interfaces;

public class VideoPlayer implements  Playable {
    @Override
    public void play() {
        System.out.println("Video is played - don't you see it? ;-)");
    }
}
