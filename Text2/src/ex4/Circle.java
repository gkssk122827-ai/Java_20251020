package ex4;

public class Circle extends Shape{
	
	Circle() {}
	
	Circle(int x, int y) {
	 super (x, y);
	}
	 public void draw() {
			System.out.printf("원을 (%d, %d)에 그립니다", getX(), getY());
	}
	

}
