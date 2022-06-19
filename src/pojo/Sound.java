package pojo;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 *
 * @author froste
 */
public class Sound {
    
    public static void mousePass(){
    try {
         // Open an audio input stream.
         
         AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File("..\\Torneo\\src\\sounds\\mosePass.wav"));
         // Get a sound clip resource.
         Clip clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
      } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
      }
    }
    
    
    public static void mouseClick(){
    try {
         // Open an audio input stream.
         
         AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File("..\\Torneo\\src\\sounds\\mixkit-cool-interface-click-tone-2568.wav"));
         // Get a sound clip resource.
         Clip clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
      } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
      }
    }
    
    public static void sucessfull(){
    try {
         // Open an audio input stream.
         
         AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File("..\\Torneo\\src\\sounds\\mixkit-select-click-1109.wav"));
         // Get a sound clip resource.
         Clip clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
      } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
      }
    }
    
    public static void error(){
    try {
         // Open an audio input stream.
         
         AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File("..\\Torneo\\src\\sounds\\mixkit-select-click-1109.wav"));
         // Get a sound clip resource.
         Clip clip = AudioSystem.getClip();
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
      } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
      }
    }
    
}
