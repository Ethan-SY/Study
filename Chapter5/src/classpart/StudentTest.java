package classpart;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100,"이순신"); // studentLee가 힙 메모리에 생성됨
		studentLee.address = "서울시 강남구";

		Student studentKim = new Student(); // studentLee가 힙 메모리에 생성됨
		studentKim.studentName = "김유신";
		studentKim.studentID = 101;
		studentKim.address = "미국 LA";

		studentLee.showStudentInfor();
		studentKim.showStudentInfor();

		System.out.println(studentLee);
		System.out.println(studentKim);  //주소값이 들어가있다.
	}

}
