package ch19;

public class CarFactory {
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	public static CarFactory getInstance() {
		if (instance==null) {
			instance = new CarFactory();
		}
		return instance;
	}
	public Car createCar() {
		Car instance = new Car();
		return instance;
	}
}
