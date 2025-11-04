package ex06_4_인터페이스;

 public interface Car {
	public void move();
	
	// Car 클래스를 상속하는 클래스는 fillU메소드를
	// 반드시 재정의 하세요
	public abstract void fillUp();
}
