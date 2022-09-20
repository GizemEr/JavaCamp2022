package javahw;
//While Döngüsü : şart sağlanana kadar işlemi yapmaya devam eder
public class lesson12 {

	public static void main(String[] args) {
		for(int i=2;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		int i=2;
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		//başta i'yi nasıl arttıracağımızı belirtmedik while için bu yüzden sonsuz döngü oluştu
		System.out.println("While Döngüsü Bitti");
	}

}
