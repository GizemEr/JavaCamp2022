package kodlamaio.business;

import java.util.List;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.CategoryDao;
import kodlamaio.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	public void add(Category category) throws Exception {
		for(Category category_ : categories) {
		if(category.getCategoryName() == category.getCategoryName()) {
			throw new Exception("Kategori ismi tekrar edemez");
		}
		}
		
		for (Logger logger : loggers) {
			logger.log(category.getCategoryName());
		}
		categoryDao.add(category);
		categories.add(category);
	}
}
