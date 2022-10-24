package kodlamaio.dataAccess;

import kodlamaio.entities.Category;

public class JdbcCategoryDao implements CategoryDao{
	public void add(Category category) {
		System.out.println("JDBC ile veritabanına eklendi");
	}
}
