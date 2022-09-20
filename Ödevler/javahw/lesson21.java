package javahw;
//Mükemmel Sayılar : kendinden başka pozitif tüm tam bölenlerin sayısının toplamı kendisine eişt olan sayı
//Örnek 6,28 6 için : 1+2+3=6 28 için : 1+2+4+7+14=28
public class lesson21 {

	public static void main(String[] args) {
		//sayıları 1 den başlatıp kendisine kadar, kendisi dahil olmayacak şekilde döndürmemiz lazım
		int number=28;
		int total=0;
		
		for(int i =1; i<number;i++) {
			if(number%i==0) {
				total=total+i;
				
			}
		}if(total==number) {
			System.out.println("Mükemmel sayıdır");
		}
		else {
			System.out.println("Mükemmel sayı değildir");
		}
	}
}
