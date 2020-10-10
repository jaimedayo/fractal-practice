package view;

import processing.core.PApplet;

public class Circle extends Element implements Drawer{

	
	public Circle(int x, int y, float radius, PApplet app) {
		super(x, y, radius, app);
		// TODO Auto-generated constructor stub
	}




	public void draw() {
		// TODO Auto-generated method stub
		 app.rectMode(app.CENTER);
		 app.ellipse(x, y, radius, radius);
		  if(radius > 2) {
		    radius *= 0.75f;
		    draw();
		  }
	}




	@Override
	public void draw(int count, float rot) {
		// TODO Auto-generated method stub
		
	}
}
