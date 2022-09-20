package javahw;
//Arkadaş Sayılar : Bilinen en küçük arkadaş sayılar 220 ve 284'tür.
//Kendileri hariç pozitif tam bölenlerin toplamı birbirine eşit olan sayılardır
public class lesson22 {

	public static void main(String[] args) {
		
		int sayi1 = 220;
		int sayi2 = 284;
		int toplam1 = 0;
		int toplam2 = 0;
		
		for(int i=1; i<sayi1 ; i++) {
			if(sayi1%i==0) {
				toplam1=toplam1 + i;//Bütün sayıları bölüp toplamını bulucak
			}
		}
		for(int i=1; i<sayi2 ; i++) {
			if(sayi2%i==0) {
				toplam2=toplam2 + i;
			}
		}
		
		if(sayi1==toplam2 && sayi2==toplam1) {
			//&& bu ve demektir şartların ikiside doğruysa if bloğuna girer birde || vardır buda veya anlamına gelir
			//şartlardan birinin doğru olması if bloğuna girmesi yeterlidir
			System.out.println("Bu iki sayı arkadaştır");
		}else {
			System.out.println("Bu iki sayı arkadaş değildir");
		}
	}
}
