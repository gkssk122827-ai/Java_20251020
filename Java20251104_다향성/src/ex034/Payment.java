package ex034;

public interface Payment {
	
	void pay (int amount);

}
class CreditCard{
	void fare(int amount) { //교통요금
		System.out.printf("신용카드로 %d 결제했습니다.\n",amount);
	}
	
}
class Kakaopay{
	void fee(int Kakaopay) { //서비스요금,팁
	System.out.printf("카카오페이로 %d 결제했습니다.\n", Kakaopay);
	}
	
}
class Samsungpay{
	void charge(int Samsungpay) { //일반 요금
	System.out.printf("삼성페이로 %d 결제했습니다.\n", Samsungpay);
	}
}
	


