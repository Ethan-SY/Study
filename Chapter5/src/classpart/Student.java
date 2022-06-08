package classpart;

public class Student { // class는 대부분 대문자로 시작

	// 학생이 가지는 속성들(멤버변수로 나타냄)
	int studentID; // 변수는 소문자로 시작
	String studentName;
	int grade;
	String address;

//	public Student() {}  클래스에 생성자가 하나도 없는경우! 자바 컴파일러가 디폴트 생성자를 만들어줌
	public Student() {
	}
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
	}
	public void showStudentInfor() { // 메소드 이름도 소문자로 시작
		System.out.println(studentName + "," + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}

	
		
		
	
}
