package ex13;

import java.lang.reflect.Method;

public class Student {
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	public String getName() {
		return name;
	}
	
	Student(){
		
	}

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		
	//public int getTotal(int no, int kor, int eng) {
		//return 
	
	}
	public int getTotal() {
		return kor+eng+math;
	}
	public float getAverage() {
		float avg = Math.round(getTotal()/3.0f*10)/10.0f;
		
		return avg;
	}
	public float getAverage2() {
		float avg =getTotal()/3.0f;
		
		return avg;
	}
	//public String name() {String name, int no, int kor, int eng
	public String info() {
		return name + ","+ban+","+no+","+kor+","+eng+","+math+","+
					getTotal()+","+getAverage ();
	}
}

