package javahw;

//switchDemo
public class lesson10 {
// bir diğer şartlı blok yöntemimiz switch bloklarıdır
	public static void main(String[] args) {
		char grade = 'G';
// B ve C aynı sonuç yazdırılıcaksa B'nin altındaki kısmı silersin C ,le aynı sonucu yazdırır
		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kaldınız");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
		}
	}
}