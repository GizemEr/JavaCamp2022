package methodOverloading;

public class DortIslem {
	//isimleri aynıdır ama imzaları farklı olduğu için isimlerinin aynı olması sorun yaratmaz
	public int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	
	public int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1+sayi2+sayi3;
	}
	
}
