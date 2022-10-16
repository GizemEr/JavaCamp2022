package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
}
//gamecalculator'ı kim kullanırsa gameover'ı olduğu gibi kullanmak zorunda final sayesinde 
//hesapla kısmı için ise kim implemente(yada inherit) ediyorsa hesaplayı içermek zorunda fakat hesaplayı override etmek zorunda
//yani kendi yazmak zorunda hesaplayı 
//abstract bir sınıfın abstract olabilmesi için abstract imzasıyla beslenmesi gerekiyor(satır 3)
//operasyonun abstract olabilmesi için yine abstract ile beslenmesi gerekiyor(satır 4)
//abstract bir class'da illa bir abstract olmak zorunda değil, böyle bir zorunluluk yoktur
//