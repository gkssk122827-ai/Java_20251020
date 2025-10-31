package ex1;

public class Hanna {
	private static Hanna Han = new Hanna();
	
	private Hanna() {}
	
	public static Hanna getInstance() {
		return Han;
	}

}
