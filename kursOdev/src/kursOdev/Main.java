package kursOdev;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course();
			course1.id = 1;
			course1.name = "C#+ANGULAR";
			course1.unitPrice = 350;
			course1.detail = "Yazılım Geliştirici Yetiştirme Kampı";
			
		Course course2 = new Course();
		    course2.id = 2;
		    course2.name = "Java + REACT";
		    course2.unitPrice = 400;
		    course2.detail = "Yazılım Geliştirici Yetiştirme Kampı";
		    
		 Course[] courses = {course1, course2};
		 
		 for (Course course : courses) {
			 System.out.println(course.name+" "+course.unitPrice+"TL");
		 }
		 
		 System.out.println("-----------------------");
		 
		Student student1 = new Student(1, "yasin", "Özbey", 25);
		Student student2 = new Student(2, "Şeyma", "Karaköse", 20);
		
		Student[] students = { student1, student2 };

		for (Student student : students) {
			System.out.println(student.name+" "+student.surname);
		}
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.add(student2);
		
		System.out.println("-----------------------");
		
		Instructor instructor1 = new Instructor();
		instructor1.id =1;
		instructor1.name ="Engin";
		instructor1.surname ="Demiroğ";
		instructor1.age =35;
		instructor1.information="Yazılım geliştirici yetiştirmede uzman";
		
		Instructor instructor2 = new Instructor();
		instructor2.id =2;
		instructor2.name ="Kerem";
		instructor2.surname ="Varış";
		instructor2.age =32;
		instructor2.information="Uzman yazılım geliştirici";
		
        Instructor[] instructors = {instructor1, instructor2};
		
		for(Instructor instructor : instructors) {
			System.out.println(instructor.name+" "+instructor.surname);
		}
		
System.out.println("-----------------------");
		
	    InstructorManager instructorManager = new InstructorManager();
	    
	    instructorManager.add(instructor1);
	    
	    instructorManager.delete(instructor1);
	    
	    instructorManager.update(instructor1);
	    
	    System.out.println("-----------------------");

		CourseManager courseManager = new CourseManager();

		courseManager.add(course1);

		courseManager.add(course2);

		courseManager.completed(course1);

		courseManager.completed(course2);
		
		System.out.println("-----------------------");

		
	}

}
