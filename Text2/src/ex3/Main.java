package ex3;

public class Main {

	public static void main(String[] args) {
		Printer P = new LaserPrinter();
		P.print("테스트 출력");
		
		P= new InkjetPrinter();
		P.print("테스트 출력");
	}
}