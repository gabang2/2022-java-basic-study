package ch08;

public class Test {
	public static void main(String[] args) {
		// Person 객체 생성
		Person person = new Person(180, 78, "남성", "Tomas", 37);
		person.showPerson();
		
		// Order 객체 생성
		Order order = new Order();
		order.orderNum = "20201102003";
		order.orderPhone = "01023450001";
		order.orderAddress = "서울시 강남구 역삼동 111-333";
		order.orderDate = "20201102";
		order.orderTime = "130258";
		order.orderPrice = "35000";
		order.orderMenuNum = "0003";
		order.printOrder();
	}
}
