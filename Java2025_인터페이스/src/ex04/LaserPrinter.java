package ex04;

public class LaserPrinter implements Printer{

	@Override
	public void print(String messge) {
		System.out.println("레이저프린터 출력"+messge);
	}

}
