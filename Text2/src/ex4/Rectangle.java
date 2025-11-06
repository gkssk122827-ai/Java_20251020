package ex4;

public class Rectangle extends Shape{
	
	Rectangle() {}
	
	public Rectangle(int x, int y) {
	 super (x, y);
	}
	 public void draw() {
			System.out.printf("사각형을 (%d,%d)에 그립니다\n", getX(), getY());
	 }
	

}
