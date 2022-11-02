package oop1;

//PascalCase isimlendirme standardı
public class Product {// ürünü tanımlamıyorum, tanımlayabilecek ortam hazırlıyorum
	// camelCase ile field alanları yazılır(yani name,unitPrice...)
	private String name;// şablon hazırlıyoruz burda
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitsInStock; // private sadece o class'ın içinde kullanılabilir demek

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

}
