package staticex;

public class StudentTest1 {

	public static void main(String[] args) {
		
		Student studentJ = new Student();
		System.out.println(studentJ.studentId);
		
		
		Student studentT = new Student();
		System.out.println(studentT.studentId);
		
		System.out.println(Student.getSerialNum());  // static 은 클래스 이름으로 직접 참조해서 사용함
		System.out.println(Student.getSerialNum());  // 참조변수로 사용하지 않음
	}

}
