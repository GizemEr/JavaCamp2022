package javahw;
//Do-While döngüsü
public class lesson13 {
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
		System.out.println("While Döngüsü Bitti");
		
		int j = 100;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);//j 10'dan küçük olduğu sürece bu kod çalışıcaktır.
		System.out.println("Do-While Döngüsü Bitti");
		//While döngüsünden farkı şart sağlanmasa bile çalışmasıdır. 
		//Do başta şart kontrolü işlem yapıldıktan sonra olduğu içindir.
	}
}
