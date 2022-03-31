package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class StarMap extends PApplet {

    ArrayList<Star> stars = new ArrayList<Star>();
    
    Star firstStarClicked, secondStarClicked;
    
    public float border;

    void drawGrid()
    {
        stroke(255, 0, 255);
        textAlign(CENTER, CENTER);
        textSize(20);
        for(int i = -5; i <=5; i ++)
        {
            float x = map(i, -5, 5, border, width - border);
            line(x, border, x, height - border);
            line(border, x, width - border, x);
            fill(255);
            text(i, x, border * 0.5f);
            text(i, border * 0.5f, x);
        }
    }

    void printStars()
    {
        for(Star s:stars)
        {
            System.out.println(s);
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
        float starPosX, starPosY;


        for(Star s:stars)
        {
            //starPosX = map(s.getxG(), -5, 5, border, width - border);
            //starPosY = map(s.getyG(), -5, 5, border, width - border);

            if (dist(s.getMappedX(this), s.getMappedY(this), mouseX, mouseY) < s.getAbsMag())
            {
                System.out.print(s);
                if(firstStarClicked == null)
                {
                    firstStarClicked = s;
                }
                else if(secondStarClicked == null)
                {
                    secondStarClicked = s;
                }
                else
                {
                    firstStarClicked = s;
                    secondStarClicked = null;
                }
            }



        }

    }

    public void setup() {
        colorMode(RGB);
        loadStars();
        printStars();

        border = width * 0.1f;
    }

    public void drawStars()
    {
        for(Star s:stars)
        {
            if(s == firstStarClicked || s == secondStarClicked)
            {
                s.setColour(100);
            }
            else
            {
                s.setColour(255);
            }

            s.render(this);
            
        }
    }

    public void draw() 
    {
        background(0);
        drawGrid();
        drawStars();

        fill(247, 241, 57);
        
        if(firstStarClicked != null && secondStarClicked != null)
        {
            line(firstStarClicked.getMappedX(this), firstStarClicked.getMappedY(this), secondStarClicked.getMappedX(this), secondStarClicked.getMappedY(this));
        }
        


       
    }

    
}