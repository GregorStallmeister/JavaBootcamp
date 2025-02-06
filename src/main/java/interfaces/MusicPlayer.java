package interfaces;

import com.adonax.audiocue.AudioCue;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;
import java.net.URL;

public class MusicPlayer implements Playable{
    AudioCue myAudiocue;

    public MusicPlayer() {
           }

    @Override
    public void play()  {
        URL url = this.getClass().getResource("/songs/Rock Me Now/Pufino - Rock Me Now.mp3");

        try {
            myAudiocue = AudioCue.makeStereoCue(url, 4);
            myAudiocue.open();
            myAudiocue.play();
        }
        catch (Exception ex) {

        }
        }
    }
