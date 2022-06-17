package object;

class Student{
	
	int studentId;
	String studentName;
	
	public Student(int studentId ,String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {  // 재정의 한것
		
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(studentId == std.studentId)
				return true;
			else
				return false;
		}
		return false;
	}


}



public class EqualsTest {

	public static void main(String[] args) {
		
		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2);//주소값 비교  (물리적비교)
		System.out.println(str1.equals(str2));//문자열 자체를 비교(논리적 비기ㅛ
	
		Student std1 = new Student(1, "tom");
		Student std2 = new Student(1, "tom");
		
		System.out.println("====================");
		
		System.out.println(std1.equals(std2));
		System.out.println(std1 == std2);
	}

}
