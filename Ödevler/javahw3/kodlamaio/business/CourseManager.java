package kodlamaio.business;

import java.util.List;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.CourseDao;
import kodlamaio.dataAccess.HibernateCourseDao;
import kodlamaio.dataAccess.JdbcCourseDao;
import kodlamaio.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;
	
	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {//CourseManager new'lendiğinde bana bir CourseDao ver demek 
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}


	public void add(Course course) throws Exception {
		//iş kuralları
		if(course.getCoursePrice()<0) {
			throw new Exception("Kursun fiyatı 0'dan küçük olamaz");
		}
		
		for (Course course_ : courses) {
		if(course_.getCourseName()==course_.getCourseName()) {
			throw new Exception("Kurs ismi mevcuttur, kurs ismi tekrar edemez.");
		}
		}
		courseDao.add(course);
		courses.add(course);
		
		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
}
