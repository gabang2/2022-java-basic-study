package ch11;

public class CalculatorTest {
	public static void main(String args[]) {
		
		int num1 = 10;
		int num2 = 2;
		
		// Calc가 자료형이 되어도 됨
		CompleteCalc calc = new CompleteCalc(); // 인터페이스 타입이라 모두 호출 가능
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		calc.showInfo();
		
	}
}
