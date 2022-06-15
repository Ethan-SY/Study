package cooperation;

public class Student {
	
	String studentName;
	int grade;
	int money;
	
	public Student(String studentName, int money) {  //기본생성자로는 인스턴스를 생성할 수 없다.
		this.studentName = studentName;              //기본생성자가 없기 때문에
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		bus.take(1000);
		money -= 1000;
	}
	
	public void takeSubway(Subway subway) {  //생성된 인스턴스가 매게변수로 들어와야함
		subway.take(1500);
		money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + " 님의 남은돈은 " + money +" 입니다.");
	}
}
