package javahw;
//Stringlerle Çalışmak
//StringsDemo
//Stringler bir karakter dizisidir : char[]
public class lesson17 {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
		System.out.println("Eleman Sayısı : " +mesaj.length());
		System.out.println("5. Eleman : " +mesaj.charAt(4));
		System.out.println(mesaj.concat(" Yaşasın!"));//concat birleştirmek demek
		//Boşluğunda bir karakter olduğunu unutma
		System.out.println(mesaj.startsWith("b"));//içerde yazdığımız ile başlıyorsa true, başlamıyorsa false döndürür bize
		System.out.println(mesaj.endsWith("."));
		//Java casesensitive bir dildir yani büyük-küçük harf duyarlıdır aynı harf olsa bile büyük-küçük farklılığı varsa false döner
		char[] karakterler = new char[5];
		mesaj.getChars(0,5,karakterler,0);//başlangıç,bitiş,ne aktarılacak,kaçıncı karakterden itibaren
		System.out.println(karakterler);//5. yi dahil etmiyor 
		System.out.println(mesaj.indexOf("av"));
		//belirttiğim karakterin ister string ister char olarak yazabilirim, bu charın mesajın içerisinde kaçıncı eleman olduğunu bulmaya yarar
		//ilk bulduğunu verir ve aramyı bitirir
		System.out.println(mesaj.lastIndexOf("a"));
		//sondan aramaya başlar ama baştan başlanmış gibi index numarasını verir
    }
}
