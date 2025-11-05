package ex3;

public class LaserPrinter implements Printer {

	@Override
	public void print(String message) {
		System.out.println("레이저 프린트 : "+message);
	}
	}
	
