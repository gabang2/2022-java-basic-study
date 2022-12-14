package ch11;

public class MakeReport {
	// String에 계속 + 해서 쓰면 오버헤드가 되기 때문에 StringBuffer()을 써서 String을 Return하는 방식이 잘 쓰임.
	StringBuffer buffer = new StringBuffer(); 
	
	private String line = "========================================\n";
	private String title = " 이름\t  주소 \t\t  전화번호 \n";
	private void makeHeader() {
		buffer.append(line);
		buffer.append(title);
		buffer.append(line);
	}
	
	private void generateBody() {
		buffer.append("james \t");
		buffer.append("Seoul Korea \t");
		buffer.append("010-2222-3333\n");
		
		buffer.append("Tomas \t");
		buffer.append("NewYourk US \t");
		buffer.append("010-9999-2222\n");
	}
	
	private void makeFooter() {
		buffer.append(line);
	}
	
	public String getReport() {
		makeHeader();
		generateBody();
		makeFooter();
		return buffer.toString(); //StringBuffer을 String으로 변환해주는 메서드
	}
}
