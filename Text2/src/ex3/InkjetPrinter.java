package ex3;

public class InkjetPrinter implements Printer{

	@Override
	public void print(String message) {
		System.out.println("잉크젯프린트 : "+ message);
	}
	
}
	
