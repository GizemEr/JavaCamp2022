package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

//Dao: Data Access Object demek 
public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		//sadece ve sadece db erişim kodları buraya yazılır, SQL bilmek gerekir
		System.out.println("JDBC ile veritabanına eklendi");
	}
}
//Hibernate