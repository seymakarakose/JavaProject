package kursOdev;

public class Student extends Member {
	
	public Student() {
		System.out.println("Ben �al��t�m");
	}
	
	public Student(int id, String name, String surname, int age) {
		this.surname = surname;
		this.age = age;
		
	}
	
	
	
	
	String surname;
	int age;
}
