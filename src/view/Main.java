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
	c=new Circle(0,0,100, this);
	r=new Rectangle(0,0,100,this);
	}

	public void draw() {
		
		//ajuste necesarios
		translate(300, 300);
		background(255);
		escala =20+ mouseY;
		rot= (mouseY/ 60)+1;
		
		if(start) {
			 rectMode(CENTER);
		//dibujar cuadrado o rectangulo
		if(type){
			r.draw(escala);
		
		}if(type==false) {
			c.draw(escala);
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

	public void circle(int x, int y, float radius) {
		rectMode(CENTER);
		
	
			  
			}
	public void rectangle(int x, int y, float radius, int count,float rot) {
		  rectMode(CENTER);
			r=new Rectangle(x,y,radius, null);
		   r.draw();
		   r.rotateSquare(count, rot);
		}
	
}
