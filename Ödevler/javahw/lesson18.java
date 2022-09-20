package javahw;
//Stringlerle Çalışmak 2
public class lesson18 {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		//Replace : değiştirme, kullanırken önce değiştirmek istediğimiz ifadeyi sonra onun yerine gelmesini istediğimiz ifadeyi yazıyoruz
		//Bize yeni bir metin verir yani ben mesajı tekrar yazdırırsam ilk halini çıktıda gösterir 
		//yenilenmiş halini görmek için yeni bir değişkene atamamız gerekir.
		String yeniMesaj = mesaj.replace(' ','-');
		System.out.println(yeniMesaj);
		
		//Substring : bir metnin içerisinde parça alır
		System.out.println(mesaj.substring(2));//2. indexinden itibaren alır
		System.out.println(mesaj.substring(2,4));//4. indexe kadar alır (2'den başla 4'e kadar, 4 dahil değil)
		
		//Split : ayırmak
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		//lowercase : küçük harfe çeviriyor mesajı
		System.out.println(mesaj.toLowerCase());
		//uppercase : büyük harfe çeviriyor mesajı
		System.out.println(mesaj.toUpperCase());
		//bunu özellikle veritabanlarına arama ifadesi gönderdiğimizde kullanırız
		
		String mesaj2 = "     Bugün hava çok güzel.    ";
		//Farklı kaynaklardan data aldığımızda kaynak uyuşmazlıklarından dolayı başında ve sonunda boşluklar oluyor
		//trim ifadesi ile başındaki ve sonundaki boşlukları atabiliyoruz.
		System.out.println(mesaj2.trim());

	}
}
