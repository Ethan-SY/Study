package array;

public class ArrayTest {

	public static void main(String[] args) {

		
//		int[] numbers = new int[10];
//		int[] numbers2 = {1,2,3};  이렇게 초기화해도 되김함.
//		->이방식은 한줄에 같이 써야한다.
		
//		int[] numbers = new int[] {0,1,2};  초기화
//      int[] numbers;
//		numbers = new int[3];
		int[] numbers = new int[3];
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		
		for(int i=0 ; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
	
	}

}
