package interfaces;
//burada extends yerine implements vardır
public class MySqlCustomerDal implements ICustomerDal, IRepository{

	@Override
	public void Add() {
		System.out.println("My sql eklendi");
		
	}
	
}
