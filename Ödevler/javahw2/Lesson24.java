package javahw2;
//Metodlar : Methods
public class Lesson24 {
//javada direkt main'den çalışır proje
//fonksiyon yazarak kendimizi tekrarlamayı engellemiş oluyoruz
	public static void main(String[] args) {
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
		sayiBulmaca();
	}
	
	public static void sayiBulmaca() {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 6;
		boolean varMi = false;
		
		for(int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		
		if(varMi) {
			mesajVer("Sayı mevcuttur: "+aranacak);
		}else {
			mesajVer("Sayı mevcut değildir: "+aranacak);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
