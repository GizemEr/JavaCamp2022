package javahw;

public class lesson7 {
// datatypes = veri tipleri 
	// değişken tanımlarken değişkenin tuttuğu verinin tipini belirtmek gerekir, java tip güvenli bir dildir
	public static void main(String[] args) {
		int sayi = 12; //bellekte tuttuğu alana göre sayının sınırları mevcuttur
		//int tamsayı demektir
		sayi = 1311111111; // 1 sayı daha yazarsak buraya kırmızı olur o kısım
		byte sayi1 = 12;
		//her şeye long verip kısa yoldan çözmememizin sebebi veri alanını boşa harcamamak
		//ondalıklı sayıları tutmak için double kullanırız
		double sayi2 = 12.5;
		//byte, short, int ve long tamsayı tutarken, float ve double ondalıklı sayı tutar
		char karakter = 'A' ; //tek karakter tutmak istediğimizde bu veri tipinden faydalanabiliriz
		String şehir = "ANKARA"; //karakter topluluğudur
		// boolean veri tipinin karşılığı 1 veya 0'dır.
		boolean dogruMu  = false; //1 byte'lık veri tutar.

	}
}
