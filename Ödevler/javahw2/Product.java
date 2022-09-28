package javahw2;

//Lesson31-32-33-34 kısmına ait 
public class Product {
	// attribute yada field diyebiliriz
	// burada product nesnesi özellik tutuyor
	// private sadece tanımlandığı blokta geçerlidir
	// get bir değeri okumak amaçlı bir işlemdir, set ise bir değer atamaya kurmaya yarar
	//constructor : yapıcı, oluşturucu anlamına geliyor, class ile aynı isim olmalı
	
	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("Yapıcı blok çalıştı.");//bu bloğa overloading yani aşırı yükleme deniliyor
		this.id = id;
		this.renk = renk;
		this.name = name;
		this.price = price;
		this.description = description;
		this.stockAmount = stockAmount;
	}
	
	public Product() {
		
	}
	
	private int id;
	String name;
	 String description;
	 double price;
	 int stockAmount;
	 String renk;
	 String kod;

	// getter bloğu
	public int getId() {
		return id;
	}

	// setter bloğu
	void setId(int id) {
		this.id = id;// this içerisinde bulunduğum class demek
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public String getKod() {
		return this.name.substring(0,1) + id;
	}

	

}
