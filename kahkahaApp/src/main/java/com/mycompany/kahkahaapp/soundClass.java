/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.kahkahaapp;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class soundClass {
    
    Clip clip;
    
    public void setFile(String soundFileName){
        
        try{
            File file = new File(soundFileName);
            AudioInputStream sound = AudioSystem.getAudioInputStream(file);
            clip = AudioSystem.getClip();
            clip.open(sound);
        }
        catch(Exception e){
            
        }  
    }
    
    public void play(){
            clip.setFramePosition(0);
            clip.start();
        }
}
