package staticDemo;

public class ProductManager {
	public void add(Product product) {
		
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}else {
			System.out.println("Ürün bilgileri geçersizdir.");
		}
		
//		ProductValidator productValidator = new ProductValidator();
//		productValidator.bisey();
	}
}
//manager sınıfları static yapılmaz mesela int bisey = 5; yapıldığında bisey bütün kullanıcılarda 5 oluyor
//ama ProductValidator gibi kullan-bırak araçlar static yapılabilir 
