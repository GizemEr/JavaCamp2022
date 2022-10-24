package kodlamaio.dataAccess;

import kodlamaio.entities.Category;

public class HibernateCategoryDao implements CategoryDao{
	public void add(Category category) {
		System.out.println("Hibernate ile veritabanına eklendi.");
	}
}
