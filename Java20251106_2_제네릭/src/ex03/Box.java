package ex03;

public class Box<T extends Person> {
	/*
	 * 타입 제한 : <extends person>
	 * T 전달될 수 있는 객체는
	 * Person 이거나 Person 자손들만 가능
	 */
	T item;
	void setItem(T item) {
		this.item=item;
	}
	T getItem(int x) {
		return item;
	}

}


/*
 public class Box<Car> {
 
 	Car item;
  
 	 void setItem(Car item) {
  		this.item = item;
  }
  	Car getItem(){
  		return item;
  
  - 이 Box 상자에는 toy만 집어넣는다
  public class Box<T> {
	
	Toy item;
	
	void setItem(Toy item) {
		this.item=item;
	}
	
	Toy getItem() {
		return item;
	}

}
 - 이 Box 상자에는 String만 집어넣는다
  public class Box<T> {
	
	String item;
	
	void setItem(String item) {
		this.item=item;
	}
	
	String getItem() {
		return item;
	}

}
 */
