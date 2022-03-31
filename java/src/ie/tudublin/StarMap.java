package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class StarMap extends PApplet {

    ArrayList<Star> stars = new ArrayList<Star>();
    
    float border;
   
    void drawGrid()
    {
        stroke(255, 0, 255);
        textAlign(CENTER, CENTER);
        textSize(16);

        for(int i = -5; i <=5; i++)
        {
            float x = map(i, -5, 5, border, width - border);
            line(x, border, x, height - border);
            line(border, x, width - border, x);
            fill(255);
            text(i, x, border * 0.5f);
            text(i, border * 0.5f, x);
        }
    }


    // void drawGrid()
    // {
    //     for(int i=0; i< width; i+=width/10)
    //     {
    //         line(i, 0, i, width);
    //         line(0, i, width, i);
    //     }
    // }

    void printStars()
    {
        for(Star s:stars)
        {
            System.out.println(s);
            //fill(235, 232, 52);
            //circle(s.getX6(), s.getYg(), 10);
        }
    }

    

    void loadStars()
    {
        Table table = loadTable("HabHYG15ly.csv", "header");
        for(TableRow r:table.rows())
        {
            Star s = new Star(r);
            stars.add(s);
        }
    }

    public void settings() {
        size(800, 800);
    }


    public void mouseClicked()
    {
        
    }

    public void setup() {
        colorMode(RGB);
        //drawGrid();
        border = width *0.1f;
        loadStars();
        //printStars();
        
    }

    public void drawStars()
    {

        for(Star s:stars)
        {
            //System.out.println(s);
            //fill(235, 232, 52);
            //System.out.println(s.getX6());
            circle(map(s.getX6(), -5, 5, border, width-border), map(s.getYg(), -5,5, border, height-border), 10);
        }
    }

    public void draw() 
    {
        background(0);
        drawGrid();
        drawStars();
    }
}