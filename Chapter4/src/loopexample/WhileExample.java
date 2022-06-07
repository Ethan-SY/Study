package loopexample;

public class WhileExample {

	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;  // 초기화 필요!
		while(num <= 10) {  //(true)면 계속 수행된다.
			
			sum +=num; //sum = sum + num;
			num++;
		}
		System.out.println("1부터 10까지의 합은 "+sum+" 입니다.");
	
		// do - while 은 무조건 수행문을 한번 실행한다.
	int num2 = 1;
	int sum2 = 0;
	
	do {
		sum2 += num2;
		num2++;
	}while(num2 < 1);
	System.out.println("1부터 10까지의 합은 "+sum2+" 입니다.");
	
	
	}
}
