package ch06;

public class VIPCustomer extends Customer{
	String agentName;
	double salesRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
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
	
	@Override
	public int calcPrice(int price) {
		this.bonusPoint += price * bonusRatio;
		price -= (int)(price * salesRatio);
		return price;
	}
}
