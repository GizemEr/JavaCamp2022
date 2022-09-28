package javahw2;

public class Lesson28 {
//class'lar referans tiptir -reference type
	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();//class bu şekilde çağrılır 
		//üstteki satırı CustomerManager customerManager; şeklinde yazsak da çalışır
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		
	}
}
