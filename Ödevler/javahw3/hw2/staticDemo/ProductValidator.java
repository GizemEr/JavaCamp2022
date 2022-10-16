package staticDemo;

public class ProductValidator {
	static {//birden fazla static blok oluşturabiliriz,  hepsi çalışır 
		System.out.println("Static Yapıcı blok çalıştı");
	}
	
	public ProductValidator() {//bu bloğun çalışması için ProductManager'da new'leme yaptık, çünkü static değil
		//static olsaydı new'leme yapmamız gerekmezdi 
		System.out.println("Yapıcı blok çalıştı");
	}
	public static boolean isValid(Product product) {//bir metodu static yaptığımızda class ismiyle direkt çağrılabilir
		if (product.price>0 && !product.name.isEmpty()) {//ürünün veritabanında kaydedilebilmesi için ürünün fiyatının sıfırdan büyük olması ve ismininde verilmiş olması lazım  
			return true;
		}
		else {
			return false;
		}
	}
	
	public void bisey() {
		
	}
	
//	public static class BaskaBirClass{//inner class
//		public static void Sil() {
//			
//		}
//	}
}
//static yaptığımız zaman ProductValidator bir kere oluşur ve onu bütün kullanıcılar o şekilde kullanır
//araç amacıyla kullanacağımız bu şekildeki yapılarda static kullanırız 
//static tanımlandığında bellekten atılmaz uygulama sıfırlanana kadar, new'leme yaptıklarımız gibi kullanıp bellekten atılma olmaz
//bu yüzden ProductManager static tanımlanmadı 
//#C'da yapıcı blok parametresiz de çalışır 
//ana class'ımız static olamıyor javada yani public static class ProductValidator olmaz 