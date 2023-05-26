//********************************************************************************
// NAME:JANEEL ABRAHAMS
//PANTHERID:  [6242670]
// CLASS: COP 2210 – [FALL 2020]
// ASSIGNMENT #3 
// DATE: [11/4/2020]
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.

package com.mycompany.haunted;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
/**
 *
 * @author neely
 */
public class Sounds {
 
    void playMusic(String musicLocation) 
    {
        try
        {
            File musicPath= new File(musicLocation);
                    if(musicPath.exists())
                    {
                      AudioInputStream audioInput =   AudioSystem.getAudioInputStream(musicPath);
                      Clip clip = AudioSystem.getClip();
                      clip.open(audioInput);
                      clip.start();
                      clip.loop(Clip.LOOP_CONTINUOUSLY);
                      
                      
                      JOptionPane.showMessageDialog(null,"Click okay to stop playing");
                      
                      
                    }
                    else
                    {
                        System.out.println("Can't find file");
                    }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
}
