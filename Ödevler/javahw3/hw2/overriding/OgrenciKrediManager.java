package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	public double hesapla(double tutar) {
		return tutar * 1.10;//biz bu işlemle Base'ın hesapla fonksiyonunu ezmiş olduk
	}
}
