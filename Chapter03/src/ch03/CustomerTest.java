package ch03;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(1, "김가영");
		customerLee.bonusPoint = 100;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(2, "김윤영");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		// 업캐스팅
		Customer vc = new VIPCustomer(12345, "noname");
		// VIPCustomer의 멤버변수는 사용할 수 없음 <- 원할 경우 다운캐스팅 하기
		
	}

}
