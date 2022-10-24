package kodlamaio.dataAccess;

import kodlamaio.entities.Course;
//interfaceler sadece metod imzasını barındırabilir
public interface CourseDao {
	void add(Course course);
}
