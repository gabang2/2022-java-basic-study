package ch10;

public class BirthdayDate {

	public static void main(String[] args) {
		
		Birthday date = new Birthday();
		date.setYear(2000);
		date.setMonth(10);
		date.setDay(20);
		
		date.showDate();
		// 객체를 사용할 때 문제가 발생할 수 있는 부분을 제어하기 위해서 private를 사용함.
		// 사용하는 쪽에서 잘못 사용하는 것을 방지함.
	}

}
