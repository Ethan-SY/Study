package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		double[] num = new double[5];
		int size = 0;
		num[0] = 10.0; size++;
		num[1] = 20.0; size++;
		num[2] = 30.0; size++;
	
		double total = 1;
		
		for(int i=0; i<size;i++) {
			total *= num[i];
		}
		System.out.println(total);
	}

}
