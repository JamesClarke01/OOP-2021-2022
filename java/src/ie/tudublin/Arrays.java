package ie.tudublin;

import com.jogamp.nativewindow.util.Rectangle;

import processing.core.PApplet;

public class Arrays extends PApplet{

    float[] rainfall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58 };

    String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

    //float[] a1 = new float[100]; //alternate way of creating array in java
    //float[] a2;  //wil cause a reference(pointer) error because the amount of memory for the array has not been assigned

    public void settings()
    {
        size(500, 500);
    }

    int minIndex = 0;
    int maxIndex = 0;
    
    public void setup()
    {
        colorMode(RGB);

        //iterating over an array using a for loop
        for(int i = 0; i < rainfall.length; i++)
        {
            println(rainfall[i] + "\t" + months[i]); //dont have to write System.out.println as println is from the pApplet superclass
        }

        //"enhanced" for loop, a foreach loop. Not as cool as the name implies, has you cant easily achieve the loop above for example
        for(float r:rainfall)
        {
            println(r);
        }

        //iterating backwards throught array
        for(int i = rainfall.length - 1; i >= 0; i--)
        {
            println(rainfall[i] + "\t" + months[i]);
        }

        
        float totalRainfall = 0;

        for(int i = 1; i < rainfall.length; i++)
        {
            if(rainfall[i] < rainfall[minIndex])
            {
                minIndex = i;
            }

            if(rainfall[i] > rainfall[maxIndex])
            {
                maxIndex = i;
            }

            totalRainfall += rainfall[i];
        }

        float averageRainfall = totalRainfall / rainfall.length;

        println("The least amount of rainfall was " + rainfall[minIndex] + "mm in the month " + months[minIndex]);
        println("The most amount of rainfall was " + rainfall[maxIndex] + "mm in the month " + months[maxIndex]);
        println("The total amount of rainfall was " + totalRainfall + "mm");
        println("The average rainfall was " + averageRainfall + "mm");

    }

    public void draw()
    {
        background(0);
        
        stroke(0);
        //noStroke();

        float w = width/ (float)rainfall.length;  //must cast float to prevent rounding
        float length;
        float x;
        float c;
        float h;
        

        for(int i = 0; i < rainfall.length; i++)
        {
            length = rainfall[i];
            
            x = map(i, 0, rainfall.length, 0, width);
            h = map(rainfall[i], 0, rainfall[maxIndex], 0, height);
            
            //middle value travelling from 100 to 255
            c = map(rainfall[i], rainfall[minIndex], rainfall[maxIndex], 255, 100);

            fill(250,c,100);
            
            rect(x, height, w, -h);
            fill(0);
            textAlign(CENTER, CENTER);
            text(months[i], x + (w/2), height-50);
        }
        

    }
}
