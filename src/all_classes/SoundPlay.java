
package all_classes;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class SoundPlay {
    static public Clip play(String soundName)
    {
        Clip clip = null;
        try {
            AudioInputStream audioInputStream = null;
            audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile());
            
            try {
                clip = AudioSystem.getClip();
            } catch (LineUnavailableException ex) {
                Logger.getLogger(SoundPlay.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                clip.open(audioInputStream);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(SoundPlay.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(SoundPlay.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SoundPlay.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clip;

    }
    static public void ok()
    {
        Clip clip = null;
        try {
            AudioInputStream audioInputStream = null;
            audioInputStream = AudioSystem.getAudioInputStream(new File("ok.wav").getAbsoluteFile());
            
            try {
                clip = AudioSystem.getClip();
            } catch (LineUnavailableException ex) {
                Logger.getLogger(SoundPlay.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                clip.open(audioInputStream);
                clip.start();
            } catch (LineUnavailableException ex) {
                Logger.getLogger(SoundPlay.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(SoundPlay.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SoundPlay.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    
    static public void no()
    {
        Clip clip = null;
        try {
            AudioInputStream audioInputStream = null;
            audioInputStream = AudioSystem.getAudioInputStream(new File("no.wav").getAbsoluteFile());
            
            try {
                clip = AudioSystem.getClip();
            } catch (LineUnavailableException ex) {
                Logger.getLogger(SoundPlay.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                clip.open(audioInputStream);
                clip.start();
            } catch (LineUnavailableException ex) {
                Logger.getLogger(SoundPlay.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(SoundPlay.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SoundPlay.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    

}
