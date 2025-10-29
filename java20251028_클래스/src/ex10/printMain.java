package ex10;

public class printMain {
	
	public static void main (String[]args) {
	
		Printer pt = new Printer();
		
		Printer.println(10);
		Printer.println(true);
		Printer.println(5,7);
		Printer.println("홍길동");
		
		Printer.println(10,20);
		
		Printer p = new Printer();
		
		Printer p2 = new Printer();
		p2.print();
	}

}
