package ex034;

public class PayMain {

	public static void main(String[] args) {
		
		CreditCard cr = new CreditCard();
		cr.fare(10000);
		System.out.println("-----------");
		
		Samsungpay sa = new Samsungpay();
		sa.charge(10000);
		

	}

}
