package thisex;

class Person{
	
	String name;
	int age;
	
	public Person() {
		//앞에 어떠한 문장도 올 수 없다.
		this("이름없음", 1);
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Person returnSelf() {  //현재 인스턴스의 주소값
		return this;
	}
}


public class CallAnotherConst {

	public static void main(String[] args) {

		Person p1 = new Person();
		System.out.println(p1.name);
		
		System.out.println(p1.returnSelf());
	}

}
