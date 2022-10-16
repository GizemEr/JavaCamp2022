package interfaces;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;//ben bir tane ICUstomerDal istiyorum diyor(sql, oracle, mysql)
	}
	public void add() {
		//iş kodları yazılır 
		customerDal.Add();
	}
}
