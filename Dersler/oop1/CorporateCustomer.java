package oop1;

//kurumsal müşteri
public class CorporateCustomer extends Customer {
	private String companyName;
	private String taxNumber;// vergi numarası

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}
}
