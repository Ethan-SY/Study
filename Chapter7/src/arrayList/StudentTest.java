package arrayList;

public class StudentTest {

	public static void main(String[] args) {

		Student Lee =  new Student(1, "LEE");
		Lee.addSubject("국어", 100);
		Lee.addSubject("수학", 90);

		Lee.showStudentInfo();
		System.out.println("---------------------");
	
		Student Kim =  new Student(2, "KIM");
		Kim.addSubject("국어", 60);
		Kim.addSubject("수학", 30);
		Kim.showStudentInfo();
	}

}
