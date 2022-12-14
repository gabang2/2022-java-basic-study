package ch12;

public class Person {
	
	String name;
	int age;
	
	public Person() {
		// 이 이전에 statement 쓸 수 없음.
		this("김가영", 23);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void showPerson() {
		System.out.println(name + ", " + age);
	}
	
	public Person getPerson() {
		return this;
	}
	
	public static void main(String[] args) {
		Person person = new Person();
		person.showPerson();
		System.out.println(person); // ch12.Person@515f550a
		System.out.println(person.getPerson()); // ch12.Person@515f550a
	}
}
