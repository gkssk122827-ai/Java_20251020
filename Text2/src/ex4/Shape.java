package ex4;

public class Shape {
	private int x;
	private int y;

	Shape() {}
	
	Shape (int x, int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() { return x; }
	public void setX(int x) {this.x=x; }
	
	public int getY() { return y; }
	public void setY(int y) { this.y=y; }
	
	public void draw() {
		System.out.printf("도형을 (%d,%d)에 그립니다\n", x, y);
	}
}
