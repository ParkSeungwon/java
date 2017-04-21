import java.io.*;

abstract class Figure {
	abstract void area();
//	abstract void draw();
}

interface Draw {
	String s = "형태는?";
	void draw();
}

class Rect extends Figure implements Draw
{
	Rect(int x, int y) {
		this.x = x; 
		this.y = y;
	}
	protected int x, y;
	void area() {
		System.out.println("넓이는 " + x * y);
	}
	public void draw() {
		System.out.println(s + "사각형");
	}
}

class Triangle implements Draw
{
	public void draw() {
		System.out.println("삼각형");
	}
}

public class hello 
{
	public static void main(String[] args) {
		Rect r = new Rect(2,3);
		r.area();
		r.draw();
	}
}
