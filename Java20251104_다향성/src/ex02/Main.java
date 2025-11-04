package ex02;

abstract class Player{ //추상클래스
	abstract void play(int pos); //추상메소드
	abstract void stop(); //추상메소드
	
	void func() {}
	
}
class AudioiPlayer extends Player{
	void play(int pos) {
		System.out.println("---AudioiPlayer----");
		
	}
	void stop() {
		
	}
}

class CDPayer extends Player {

	@Override
	void play(int pos) {
		System.out.println("---CDPayer----");
	}
	
	@Override
	void stop() {
	}
	
}
abstract class MyMyPlayer extends Player{
	@Override
	void play(int pos) {
		
	}
	
}

	
	//1. 추상클래스는 객체 생성 불가
//	player p1 = new plaver
	
	public class Main {
		public static void main(String[] args) {
		Player p = new AudioiPlayer();
		p.play(1);
		
		p= new CDPayer();
		p.play(1);
		
		//p = new MyMyPlayer(); MyMyPlayer() 미완성클래스(추상클래스)
		}
}

