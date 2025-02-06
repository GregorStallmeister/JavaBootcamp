package interfaces;

import com.adonax.audiocue.AudioCue;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.net.URL;

public class MusicPlayer implements Playable {
    AudioCue myAudiocue;

    public MusicPlayer() {
    }

    @Override
    public void play() {
        URL url = this.getClass().getResource("/songs/RockMeNow/PufinoRockMeNow.Wav");
        System.out.println("Now we hear: ");
        System.out.println("Music track: Rock Me Now by Pufino\n" +
                "Source: https://freetouse.com/music\n" +
                "Royalty Free Music (Free Download)");

        try {
            myAudiocue = AudioCue.makeStereoCue(url, 4);
            myAudiocue.open();
            myAudiocue.play();
            myAudiocue.setVolume(3, 0.4);
//            myAudiocue.setSpeed(3, 0.5);

//            wait(10000);
//            long startMilliSec = System.currentTimeMillis();
//            while (true) {
//                long currentMilliSec = System.currentTimeMillis();
//
//                if (currentMilliSec - startMilliSec >= 10000)
//                    break;
//            }
//
//            myAudiocue.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.toString());
        }
    }

    public void quitPlaying() {
        myAudiocue.close();
    }
}
