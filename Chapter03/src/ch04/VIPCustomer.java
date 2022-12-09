package ch04;

public class VIPCustomer extends Customer{
	String agentName;
	double salesRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.01;
		salesRatio = 0.1;
		agentName = "이미영 팀장";
	}
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.01;
		salesRatio = 0.1;
		agentName = "이미영 팀장";
	}
	
	public void calcPrice(int price) {
		price -= price * this.salesRatio;
	}
}
