package ch06;

import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customer1 = new Customer(10010, "가영");
		Customer customer2 = new Customer(10010, "가영");
		Customer customer3 = new GoldCustomer(10010, "가영");
		Customer customer4 = new GoldCustomer(10010, "가영");
		Customer customer5 = new VIPCustomer(10010, "가영");
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		
		Customer hello = new VIPCustomer(); // 업캐스팅
		VIPCustomer hello2 = (VIPCustomer)hello; // 다운캐스팅
		System.out.println("==== 업다운캐스팅 확인 ====");
		System.out.println(hello instanceof VIPCustomer);
		System.out.println(hello instanceof Customer);
		System.out.println(hello2 instanceof VIPCustomer);
		System.out.println(hello2 instanceof Customer);
		
		if ( customer3 instanceof GoldCustomer) {
			GoldCustomer vc2 = (GoldCustomer)customer3;
			System.out.println(customer3.customerInfo());
		}
		
		for(Customer customer : customerList) {
			System.out.println(customer.customerInfo());
		}
		
		int price = 10000;
		for(Customer customer:customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이" + cost + "를 지불하였습니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는" + customer.bonusPoint + "입니다.");
		}
		
		// 코드를 고칠 때 가장 불편한 점은, 코드가 잘 돌아가는지 모르기 때문에 힘들다 -> 따라서 클래스를 이용하여 확장성이 좋게 만드는 것이 좋음.
	}
}
