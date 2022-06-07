package ifexample;

public class IfExample1 {

	public static void main(String[] args) {

		int age = 2;

		if (age >= 8) { // 조건식이 false이므로 else 수행문이 실행된다.
			System.out.println("학교에 다닙니다.");
		} else {
			System.out.println("학교에 다니지 않습니다.");
		}
	}

}
