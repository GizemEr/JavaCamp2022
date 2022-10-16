package inheritance;
//miras demektir, class'lar arasında gerçekleştirilir
//inheritance bize ortak metodları tekrarlamamız için ortam sunar 
public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
		
	}

}
