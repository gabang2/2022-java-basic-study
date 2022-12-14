package ch04;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(); //인스턴스 생성, new는 생성자
		studentLee.studentID = 12345;
		studentLee.setStudentName("LEE");
		studentLee.address = "서울 강남구";
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student();
		studentKim.studentID = 54321;
		studentKim.studentName = "Kim";
		studentKim.address = "부산 광역시";
		
		studentKim.showStudentInfo();
		System.out.println(studentKim); // 메모리 주소를 가짐
		System.out.println(studentLee); // 메모리 주소를 가짐
	}
}
