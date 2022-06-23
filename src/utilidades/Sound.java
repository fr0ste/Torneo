/* Autor:Figueroa Mart�nez Joel Francisco
 * 
 * Fecha de creaci�n: 20/06/2022
 * Fecha de modificaci�n: 20/06/2022
 * 
 * Descripci�n: clase de sonidos utilizados segun los eventos.
 * 
 * 
 */

package utilidades;

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
    
    /**
     /* clase que devuelve un sonido pensado para cuando pase el mouse sobre
     *  un componene, por ejemplo, un boton.
     */
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
    
    /**
     * clase que reproduce un sonido de click
     */
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
    
    
    /**
     * clase que reprosuce un sonido de carga exitosa
     */
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
    
    
    /**
     * clase que devuelve un sonido de error
     */
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
