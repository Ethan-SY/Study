package chapter2;

public class ImplicitConversion {

	public static void main(String[] args) {

		byte bNum = 10;
		int num = bNum;  // 묵시적 형변환
		
		System.out.println(num);
	
		long lNum = 10; // 10이 상수풀에 4바이트로 저장되어있음
		                // 묵시적 형변환이 일어남
		
		float fnum = lNum;
		
		System.out.println(fnum);
		
		double dNum = fnum + num;
		System.out.println(dNum);
	}

}
