package day2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Course course1 = new Course(1, "C# + Angulara" , "Engin Demiroğ", "Yazılım Geliţtirici Yetiţtirme Kampı");
	Course course2 = new Course(2, "Java + React" , "Engin Demiroğ", "Yazılım Geliţtirici Yetiţtirme Kampı");
	
	
	
	
	
	Course[] courses = {course1, course2};
	
	System.out.println(courses.length);
	
	
	for (Course course : courses) 
	{
		System.out.println(course.courseName);
	}
	
	
	Category category1 = new Category();
	category1.Id = 1;
	category1.name = "Kurslarým";
	
	Category category2 = new Category();
	category2.Id = 2;
	category2.name = "Tüm Kurslar";
	
	Category category3 = new Category();
	category3.Id = 3;
	category3.name = "Kampaa Hazýrlýk";
	
	Category category4 = new Category();
	category4.Id = 1;
	category4.name = "Sýk Sorulan Sorular";
	
	
	
	CourseManager courseManager1 = new CourseManager();
	courseManager1.addToCourse(course1);
	courseManager1.addToCourse(course2);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}