package ex6;

public class car extends Vehicle{
	private String type;
	
	public car(){}
	
	public car(String brand, int year, String type) {
		super (brand, year);
		this.type=type;
	}
		public void showinfo () {
		super.showinfo();
		System.out.println("차종: "+type);
	}
		
	

}
