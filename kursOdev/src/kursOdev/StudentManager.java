package kursOdev;

public class StudentManager {
	public void add (Student student) {
		System.out.println("Öğrenci eklendi. "+student.name+" "+student.surname );
	}
	public void delete(Student student) {
		System.out.println("Öğrenci silindi.");
	}
	public void update(Student student) {
        System.out.println("Öğrenci güncellendi.");
	}
}
