package ch04;

public class Customer {
	private int customerId;
	private String customerName;
	protected int bonusPoint;
	protected String customerGrade;
	protected double bonusRatio;
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	public Customer(int customerId, String customerName) {
		this();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	public int calcPrice(int price) {
		this.bonusPoint += price * this.bonusRatio;
		return price;
	}
	
	public String customerInfo() {
		return customerName + "의 등급은 " + customerGrade + "이며 포인트는 " + bonusPoint + "입니다.";
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
}
