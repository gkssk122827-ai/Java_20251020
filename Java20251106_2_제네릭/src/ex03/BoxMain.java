package ex03;

public class BoxMain {

	public static void main(String[] args) {
		
		/*
		Box<String> sBox = new Box<>();
		Box<Car> cBox = new Box<>();
		Box<String> tBox = new Box<>();
		*/
		Box<Person> pBox = new Box<>();
		Box<Student> sBox = new Box<>();
		Box<AlbaStudent> tBox = new Box<>();
		Box<Teacher> aBox = new Box<>();
	}
	

}


class Car{}

class Toy{}

class Person{
	int x = 5;
}

class Student extends Person{}
class AlbaStudent extends Person{}


class Teacher extends Person{}
