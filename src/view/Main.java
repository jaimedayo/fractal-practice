package view;

import processing.core.PApplet;

public class Main extends PApplet {

	boolean type;
	boolean start;
	float escala;
	float rot;
Circle c;
Rectangle r;


	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}

	public void settings() {
		size(600, 600);
	}

	public void setup() {
	start=false;

	}

	public void draw() {
		
		//ajuste necesarios
		translate(300, 300);
		background(255);
		escala =20+ mouseY;
		rot= (mouseY/ 60)+1;
		
		if(start) {
		
		//dibujar cuadrado o rectangulo
		if(type){
			drawRectangle(0,0,escala,1,rot);
		}if(type==false) {
			drawCircle(0,0,escala);
		}
		}
		
			fill(50);
		//botones para controlar si cuadrado o rectangulo
		translate(-300, -300);
		 rectMode(CORNER);
		rect(20,20,80,30);
		rect(20,90,80,30);
		fill(255);
		text("circulo",40,40);
		text("cuadrado",40,110);
		
		println(rot);
	}
	public void mousePressed() {
		start=true;
		if(mouseX>=20 && mouseX<=100 && mouseY>=20 && mouseY<= 100){
			type=false;
		}
if(mouseX>= 20 && mouseX<=100 && mouseY>= 90 && mouseY<=120){
			type=true;
		}
	}

	public void drawCircle(int x, int y, float radius) {
			  rectMode(CENTER);
			  ellipse(x, y, radius, radius);
			  if(radius > 2) {
			    radius *= 0.75f;
			    drawCircle(x, y, radius);
			  }
			}
	public void drawRectangle(int x, int y, float radius, int count,float rot) {
		
		  rectMode(CENTER);
		    if(count%2==0) {
		    
		    rotate(rot*15);
		     rect(x, y, radius, radius);
			  rotate(rot*-15);
			   }else {
		    rect(x, y, radius, radius);
		 }
		     count=count+1;  
		  if(radius > 2) {
			 
		    radius *= 0.75f;
		   
  drawRectangle(x, y, radius,count,rot);
			  
		    
		   		  }
		}
	
}
