package javahw;
//Sayı Bulma
public class lesson23 {

	public static void main(String[] args) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 6;
		boolean varMi = false;
		
		for(int sayi : sayilar) {//Bu şekilde dizilerin bütün elemanlarını gezebiliyorduk
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		
		if(varMi) {//true demekle eşdeğerdi bu yazım
			System.out.println("Sayı mevcuttur");
		}else {
			System.out.println("Sayı mevcut değildir");
		}
	}
}
