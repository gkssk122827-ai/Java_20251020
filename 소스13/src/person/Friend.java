package person;

public class Friend extends Person{
	private String phoneNum;
	private String email;
	
	public Friend(){
		super();
	}
	
	public Friend (String name, String phoneNum, String email){
		super(name);
		
		this.phoneNum=phoneNum;
		this.email=email;
		
		System.out.printf("%s, %s, %s\n",name, phoneNum, email);
	}
	public String getInfo() {
		return super.getInfo()+" "+phoneNum+" "+email;
	}

}
