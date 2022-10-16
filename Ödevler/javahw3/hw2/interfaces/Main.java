package interfaces;
//uygulamalarda bağımlılığı yönettiğimiz yapılardan bir tanesidir interfaceler
public class Main {
//interface'lerde abstract'lar gibi new'lenemezler ICustomerDal customerDal = new ICustomerDal(); bu olamaz 
//interface onu implemente eden class'ın referansını tutabilir ICustomerDal customerDal = new OracleCustomerDal(); bu doğrudur
	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
		customerManager.add();

	}

}
//class'lar, abstract class'lar ve interface'ler nesne yönelimli programlamanın 3 temel üyesi 
//class'lar ile abstract class'ları birbirine benzetmiş ve kullanmıştık 
//interface'ler ise biraz daha farklı, bir class olarak kabul edilmiyorlar ama class'lar yada abstract class'lar gibi referans tutabiliyorlar
//class'larda tüm operasyonların tanımlanmış olması gerekiyordu yani method konulduğu zaman içinin dolu olması gerekiyordu
//abstract'larda kimi dolu kimi boş olabilirdi
//bir class birden fazla interface'i implemente edebiliyor yani uygulayabiliyor
//interface nerde kullanılır : operasyonu implemente edilmesi istenen durumlarda kullanılır
//extend ile implement'in farkı : bir class birden fazla interface'i implemente edebilir ama sadece bir class'ı extend edebilir'