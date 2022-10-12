
public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.GiveCredit();
		
//		CreditManager creditManager = new CreditManager();
//		creditManager.Calculate();
//		creditManager.Save();
//		
//		Customer customer = new Customer();//örneğini oluşturmak, instance oluşturmak, instance creation demek bu new'leme olayı
//		customer.Id = 1;
//		customer.City = "Ankara";
//		
//		CustomerManager customerManager = new CustomerManager(customer);
//		customerManager.Save();
//		customerManager.Delete();
//		
//		Company company = new Company();
//		company.TaxNumber = "100000";
//		company.CompanyName = "Arçelik";
//		company.Id = 100;
//		
//		CustomerManager customerManager2=new CustomerManager(new Person());
//		
//		Person person = new Person();
//		person.FirstName =
//		person.NationalIdentity = "";
//		
//		Customer c1 = new Customer();
//		Customer c2= new Person();
//		Customer c3 = new Company();
		

	}

}
