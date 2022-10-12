//bir sınıf birden fazla interface'i implemente edebilir
public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void Calculate() {
		//hesaplamalar
		System.out.println("Öğretmen kredisi hesaplandı");
		
	}
	@Override
	public void Save() {
		
	}

}
//abstract sınıflar sınıf öz. gösterir. Bu yüzden bir sınıf sadece bir abstract sınıfı inherit edebilir
//Bir sınıf bir abstract class'ı yada başka bir class'ı inherit edebilir. Yani hem class'ı hem abstract class'ı inherit edemez
//abstract sınıflarda interfacelerde asla new'lenemez ikiside referans tiplerin öz. yararlanır
//java da sınıfı direkt ezebiliriz virtual yapmamıza gerek yok
