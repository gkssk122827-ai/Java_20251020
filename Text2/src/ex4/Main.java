package ex4;

public class Main {

	public static void main(String[] args) {
		Shape S = new Shape(0,0);
		S.draw();
		
		S = new Rectangle(10,20);
		S.draw();
		
		S = new Circle(30,40);
		S.draw();
		S=new Circle ();
		S.setX(20);
		S.setY(10);
		S.draw();

	}

}
