package kodlamaio;

import java.util.ArrayList;
import java.util.List;

import kodlamaio.business.CategoryManager;
import kodlamaio.business.CourseManager;
import kodlamaio.core.logging.DatabaseLogger;
import kodlamaio.core.logging.FileLogger;
import kodlamaio.core.logging.Logger;
import kodlamaio.core.logging.MailLogger;
import kodlamaio.dataAccess.HibernateCategoryDao;
import kodlamaio.dataAccess.HibernateCourseDao;
import kodlamaio.dataAccess.JdbcCategoryDao;
import kodlamaio.dataAccess.JdbcCourseDao;
import kodlamaio.entities.Category;
import kodlamaio.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course(1, "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", 100);
		Course course2 = new Course(2, "Senior Yazılım Geliştirici Yetiştirme Kampı (.NET)", 200);
		Course course3 = new Course(3, "(2022) Yazılım Geliştirici Yetiştirme Kampı - JAVA", 300);
		Course course4 = new Course(4, "Yazılım Geliştirici Yetiştirme Kampı (JavaScript)", 400);
		Course course5 = new Course(5, "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", 500);
		Course course6 = new Course(6, "Programlamaya Giriş İçin Temel Kurs", 600);
		List<Course> courses = new ArrayList<>();
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(),loggers,courses);
		courseManager.add(course1);
		
		System.out.println("---------------------------");
		
		Category category1 = new Category(1, "Tümü");
		Category category2 = new Category(2, "Programlama");		
		List<Category> categories = new ArrayList<>();
		
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, categories);
		categoryManager.add(category2);
	}

}
