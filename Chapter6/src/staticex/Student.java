package staticex;

public class Student {
	
	private static int serialNum = 10000;  //프로그램이 메모리에 로드될때 생성됨
	int studentId;
	String studentName;
	
	public Student() {
		serialNum++;
		studentId = serialNum;
	}

	public static int getSerialNum() {
		
		int i = 10 ;  //지역변수
//		studentName = "홍길동"; // 멤버변수, 인스턴스 변수 
		return serialNum; //static변수, 클래스 변수
	}

	
}
