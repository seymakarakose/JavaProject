package kursOdev;

public class StudentManager {
	public void add (Student student) {
		System.out.println("��renci eklendi. "+student.name+" "+student.surname );
	}
	public void delete(Student student) {
		System.out.println("��renci silindi.");
	}
	public void update(Student student) {
        System.out.println("��renci g�ncellendi.");
	}
}
