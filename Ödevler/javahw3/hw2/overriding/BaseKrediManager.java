package overriding;
//Banka olarak uygulanan fazi gibi düşün 
public class BaseKrediManager {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}
//bir class'ın herhangi bir operasyonu biz aksini belirtmedikçe overridable yani üzerine yazılabilirdir
//final anahtar kelimesi ile biz hesaplayı hepsi için geçerli yaparız override yapılamaz, ezilme olmaz
//public final double hesapla şeklinde yazardık öyle olmasını isteseydik