package assignment;

public class OperationEx5 {

	public static void main(String[] args) {
	
	int num1 = 5;
	int num2 = 10;
	
	int result = num1 & num2;
	System.out.println(result);
	
	int num3 = 5; // ..0000 0101
	System.out.println(num3 << 1);  // <<= 하면 num3 값이 바뀐다.
	System.out.println(num3);
	System.out.println(num3 >> 1); // 0000 0010
	}

}
