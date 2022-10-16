package abstractClasses;
//abstract : soyut 
public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		GameCalculator gameCalculator = new WomanGameCalculator();//bu bizim bir operasyona parametre olarak GameCalculator verip istediğimizi ekleyebileceğimizi gösterir 
		
		
//		GameCalculator gameCalculator = new GameCalculator() {
//			
//			@Override
//			public void hesapla() {
//				
//				
//			}
//		};
	}

}
//abstractlar biz Base'i gizlemek istediğimiz zamanda kullanılır 
//satır 13'u yazdığımızda otomatikmen override olan kısmı getirir
//GameCalculator gameCalculator = new GameCalculator(); bu şekilde yazmak mümkün değildir
//yani abstract sınıflar asla new'lenemez
//new'lenebilmesi için bizim onun operasyonlarını override'lı kullanımdaki gibi ezmemiz gerekir 
//ama bu kullanımı asla önermiyor Engin hoca, iyi bir kullanım değilmiş
//sonuç olarak abstractlar tek başına kullanılamaz ama normal bir sınıfla yapısal olarak sınıflardan farkı yoktur