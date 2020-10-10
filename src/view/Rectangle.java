package view;

import processing.core.PApplet;

public class Rectangle extends Element implements Drawer{

	public Rectangle(int x, int y, float radius, PApplet app) {
		super(x, y, radius, app);
		// TODO Auto-generated constructor stub
	}
	

	public  void draw() {
		 
		 app.rect(x, y, radius, radius);
		  if(radius > 2) {
		    radius *= 0.75f;
		//    draw();
		  }
		}


	@Override
	public void rotateSquare(int count,float rot) {
		// TODO Auto-generated method stub

		    if(count%2==0) {
		    app.rotate(rot*15);
		   draw();
		    app.rotate(rot*-15);
			   }else {
				  draw();
		 }
		     count=count+1;  
		  if(radius > 2) {
		    rotateSquare(count,rot);
			  
		    
		   		  }
		}

	}
	

