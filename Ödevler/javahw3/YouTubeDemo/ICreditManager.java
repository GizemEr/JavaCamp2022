//metodun ne döndürdüğünü, ismini ve varsa parametreleri yazılır
//interface'in amacı yazılımdaki bağımlılıkları engellemek, if'lerden kurtulmak
public interface ICreditManager {

	void Calculate();
	
	void Save();
	
}
