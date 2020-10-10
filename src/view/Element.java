package view;
import processing.core.PApplet;
public class Element {
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
}
