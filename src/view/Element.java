package view;
import processing.core.PApplet;
public class Element implements Drawer {
public int x;
public int y; 
public float radius;
protected PApplet app;
public Element(int x, int y, float radius,PApplet app) {
	this.x=x;
	this.y= y;
	this.radius= radius;
	this.app=app;
}
@Override
public void draw() {
	// TODO Auto-generated method stub
	
}
@Override
public void rotateSquare(int count, float rot) {
	// TODO Auto-generated method stub
	
}
}
