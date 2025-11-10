package person;

public class FriendTest {

	public static void main(String[] args) {
		System.out.println("이름    전화번호         메일주소");
		System.out.println("---------------------------");
		
		Friend F1 = new Friend("홍길동","010-1234-2344","enum1@navet.com");
		F1.getInfo();
		Friend F2 = new Friend("김길동","010-1234-2355","enum2@navet.com");
		F2.getInfo();
		Friend F3 = new Friend("이자경","010-1234-2366","enum3@navet.com");
		F3.getInfo();
		Friend F4 = new Friend("홍자반","010-1234-2377","enum4@navet.com");
		F4.getInfo();
		Friend F5 = new Friend("이이경","010-1234-2388","enum5@navet.com");
		F5.getInfo();

	}

}
