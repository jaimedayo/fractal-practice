package view;

import processing.core.PApplet;

public class Circle extends Element {

	
	public Circle(int x, int y, float radius, PApplet app) {
		super(x, y, radius, app);
		// TODO Auto-generated constructor stub
	}




	public void draw() {
		 app.ellipse(this.x, this.y,radius, radius);
		  if(radius > 2) {
			  radius *= 0.75f;
		    
		    draw();
		  }
	}




	@Override
	public void rotateSquare(int count, float rot) {
		// TODO Auto-generated method stub
		
	}




}
