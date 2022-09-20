package javahw;
//ReCap Demo 2
public class lesson15 {

	public static void main(String[] args) {
		//double[] myList = new double[4]; bu şekilde de yazabilirdik bir önceki derste gördük 
		double [] myList = {1.2,6.3,4.3,5.6	};
		double total = 0;//sayıların toplamını bulma
		double max = myList[0];//en büyük sayıyı bulma 
		for(double number: myList) {
			if(max<number) {
				max = number;
			}
			total = total + number;
			System.out.println(number);
		}
		System.out.println("Toplam = " + total);
		System.out.println("En bÜyük = " + max);
	}
}
