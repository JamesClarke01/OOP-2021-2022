package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings() //setting screen size
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(RGB);
		background(0);

		
	}


	
	public void draw()
	{	
		background(50, 10, 77);  //cool ass colour (in hsb): 200, 50, 100
		
		fill(237, 237, 50);
		triangle(250, 50, 40, 470, 460, 470);  //x1, y1, x2, y2, x3, y3
		
		fill(250, 250, 250);
		ellipse(250, 250, 160, 100);  //cx, cy, w, h

		fill(0, 0 , 0);
		ellipse(250, 250, 30, 75);

		//fill(0, 0 , 0);
		triangle(250, 325, 220, 335, 220, 315);
		triangle(250, 325, 280, 335, 280, 315);

		rectMode(CENTER);
		rect(250, 50, 60, 10);
		rectMode(CORNER);
		rect(235, 0, 30, 50);
		

		//stroke(255);
		//line(10, 10, 200, 200);  //x1, y1, x2, y2


		// circle(200,250, 50); //cx, cy, r
		// ellipse(50, 200, 90, 200); //cx, cy, w, h
		
		// rectMode(CENTER);  //Ftwo parameters will go from the center of the rectangle
		// rect(300, 20, 200, 20);   //tlx, tly, w, h

		// rectMode(CORNER);  //FIRST 
		// rect(300, 20, 200, 20);   //tlx, tly, w, h

		// point(400, 50);  //x, y

		// triangle(10, 400, 50, 450, 300, 200); //x1, y1, x2, y2, x3, y3
	}
}
