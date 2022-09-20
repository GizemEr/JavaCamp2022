package javahw;
//Diziler-Arrays arraysDemo
public class lesson14 {

	public static void main(String[] args) {
		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("----------------------");
		
		String[] ogrenciler = new String[4];//Kaç elemandan oluşacağı anlamına geliyor
		ogrenciler[0] = "Engin";//indexin 0'la başladığı anlamına gelir
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";
		//ogrenciler[4] = "Ali"; bunu yazdığımızda outofbounds yani sınırların dışına çıkıldığının hatasını alırız
		
		for(int i=0;i<ogrenciler.length;i++) {//i öğrencilerin eleman sayısından küçük olucak
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("----------------------");
		
		for(String ogrenci: ogrenciler) {//Ne tutuyor öğrenci nerde tutuyor öğrenciler kısmında
			//Bu ogrenciler dizisindeki her bir elemanı gez demek, her bir elemanı gezerken o elemana takma isim tak 
			//bu takma isim her şey olabilir ama kodun okunurluğu çok önemlidir, ogrencilerin içinde ogrenci vardır sonuçta
			System.out.println(ogrenci);
		}//En iyi yazma şekli budur
		
	}
}
