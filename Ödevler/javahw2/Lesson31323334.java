package javahw2;
//classesWithAttributes
public class Lesson31323334 {
//class'ların bir diğer özelliği özellik tutmasıdır
	//bir class'ın içerisinde başka bir class'ı tutabiliriz
	public static void main(String[] args) {
		Product product = new Product(1,"Laptop", "Asus Laptop", 3000, 2, "Siyah");//bu şekilde yada alttaki gibi kullanabiliriz
		/*Product product = new Product();
		product.name = "Laptop";
		product.setId(1);
		product.description = "AsusLaptop";
		product.price = 5000;
		product.stockAmount = 3;*/
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		
		
	}//product kısmının kırmızı olmasının sebebi productların private tanımlanmış olmasıdır

}

//Encapsulation kapsülleme denilen bir yöntemdir, kullanıcıyı herhangi bir alanı kullanması için kısıtlamayı öngörür