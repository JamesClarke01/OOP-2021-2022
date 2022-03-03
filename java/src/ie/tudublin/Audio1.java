package ie.tudublin;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;
import processing.core.PApplet;

public class Audio1 extends PApplet
{
    Minim minim;
    AudioPlayer ap;
    AudioInput ai;
    AudioBuffer ab;

    public void settings()
    {
        size(1024, 500);
    }

    public void setup()
    {
        minim = new Minim(this);
        ai = minim.getLineIn(Minim.MONO, width, 44100, 16);
        ab = ai.mix;
    }

    public void draw()
    {
        colorMode(HSB);
        background(0);
        
    

        //fill(255,132, 122);
        float halfH = height/2;
        for(int i = 0; i < ab.size(); i++)
        {
            stroke(map(i, 0, ab.size(), 0, 255), 150, 150);
            fill(255,132, 122);
            line(i, halfH, i, halfH + ab.get(i) *1000);
            
        }
        // average = sum/(float) ab.size();

        // stroke(255);
        // fill(100,255,255);
        // circle(width/2, halfH, average*100);
        
        // circle= (100, y, 50);
        // y+= random(-10, smoothedY, 50);
        
    }
    
}
