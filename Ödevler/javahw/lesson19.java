package javahw;
//MiniProje : Asal Sayı
public class lesson19 {

	public static void main(String[] args) {
		int number = 0;
		int remainder = number % 2;
		//System.out.println(remainder);
		boolean isPrime = true;//isPrime :  asal mı
		//biz baştan sayı asal demiş olduk bu şekilde
		
		if(number==1) {//Bunu yaptık çünkü 1 girdiğimizde de asal sayı sonucunu veriyordu ama en küçük asal sayı 2'dir
			System.out.println("Sayı asal değildir");
			return;
		}
		
		if (number<1) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		for(int i =2;i<number;i++) {
			if(number%i==0) {
				isPrime = false;
			}
		}
		if(isPrime) {//bu şekilde isPrime==true demiş gibi olduk
			System.out.println("Sayı asaldır.");
		}
		else {
			System.out.println("Sayı asal değildir.");
		}
	}//sayıyı 2 girdiğimizde for döngüsündeki i<number kısmından dolayı for döngüsüne hiç girmez
}
