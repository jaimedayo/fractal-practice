package view;

import processing.core.PApplet;

public class Circle extends Element {

	
	public Circle(int x, int y, float radius, PApplet app) {
		super(x, y, radius, app);
		// TODO Auto-generated constructor stub
	}




	public void draw(float r) {
		 app.ellipse(this.x, this.y, r, r);
		  if(r > 2) {
		    r *= 0.75f;
		    
		    draw(r);
		  }
	}




}
