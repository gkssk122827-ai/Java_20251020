package ex05.copy;

public class PayMain {

	public static void main(String[] args) {
		
//		CreditCard cr = new CreditCard();
//		cr.fare(10000);
//		
//		Samsungpay sa = new Samsungpay();
//		sa.charge(10000);
//		System.out.println("-----------");
		
		Payment p = new Samsungpay();
		p.pay(50000);

	}

}
