package ch15;

public class Taxi {
	String taxiCompany;
	int taxiTotalPrice;
	
	public Taxi(String taxiCompany) {
		this.taxiCompany = taxiCompany;
	}
	
	public void take(int taxyPrice) {
		this.taxiTotalPrice += taxyPrice;
	}
	
	public void taxiInfo() {
		System.out.println(taxiCompany+"택시 수입은 " + taxiTotalPrice + "입니다.");
	}
}
