package abstractex;

public abstract class Computer { // 추상클래스 (상속을 하기위해 만든다)

	public abstract void display(); // 선언만함 {} 바디를 넣으면 안됨
    public abstract void typing();  //하위클래스 , 상속받은 클래스에서 구현한다.
    
   
	
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
}
