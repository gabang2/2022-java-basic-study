package ch21;

public class BookTest {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		// int는 0, double은 0.0, 객체는 null
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		library[0] = new Book("태백산맥1", "김가영");
		library[1] = new Book("태백산맥1", "김가영");
		library[2] = new Book("태백산맥1", "김가영");
		library[3] = new Book("태백산맥1", "김가영");
		library[4] = new Book("태백산맥1", "김가영");
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		// OBject copy해보기
	}

}
