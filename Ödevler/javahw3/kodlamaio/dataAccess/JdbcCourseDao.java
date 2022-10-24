package kodlamaio.dataAccess;
//bir paketten başka bir paketi kullanıyorsan import etmen gerekir
import kodlamaio.entities.Course;

//Dao = data access object
public class JdbcCourseDao implements CourseDao{
	public void add(Course course) {
		//sadece ve sadece db erişim kodları buraya yazılır, bunun için SQL bilmek gerekir
		System.out.println("JDBC ile veritabanına eklendi.");
	}
	
}
