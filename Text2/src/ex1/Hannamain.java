package ex1;

public class Hannamain implements Hanna{

	@Override
	public void hanna(String na) {
		System.out.println("na : "+na);
	}

	@Override
	public void lee (String na) {
		System.out.printf("나는 %s를 배우고 있습니다\n",na);
	}
	
}