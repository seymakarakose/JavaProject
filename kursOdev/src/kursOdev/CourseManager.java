package kursOdev;

public class CourseManager {
	public void add(Course course) {
		System.out.println("Kurs eklendi.");
	}
	public void delete(Course course) {
		System.out.println("Kurs silindi.");
	}
	public void update(Course course) {
        System.out.println("Kurs g�ncellendi.");
	}
	
	public void completed(Course course) {
		System.out.println("Kurs Tamamland�."+" "+course.name);
	}
}
