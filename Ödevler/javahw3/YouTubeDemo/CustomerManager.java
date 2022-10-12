//Katmanlı Mimariler 
public class CustomerManager {
//constructor'lar void olmadan class'ın ismiyle aynı olucak şekilde yazılıyorlar
	private Customer _customer;//private sadece bu class'ın içinde çalışabilir demek 
	private ICreditManager _creditManager;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {//interfac'ler referans tiptir
		_customer = customer;
		_creditManager = creditManager;
	}
	
	public void Save() {
		
		System.out.println("Müşteri kaydedildi : ");
	}
	public void Delete() {
		
		System.out.println("Müşteri silindi : ");
	}
	
	public void GiveCredit() {
		
		_creditManager.Calculate();
		System.out.println("Kredi Verildi");
	}
}
