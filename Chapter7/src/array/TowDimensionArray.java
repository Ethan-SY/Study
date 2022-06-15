package array;

public class TowDimensionArray {

	public static void main(String[] args) {
		
//		int[][] arr = new int[2][3];
		int[][] arr = {{1,2,3},{4,5,6}};
		System.out.println(arr.length);  //행의길이
		System.out.println(arr[0].length); //열의 길이 
	
	
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"  ");
				
			}
		}
		System.out.println();
		
		char[][] alphabets = new char[13][2];
		char ch ='A';
		for(int i=0; i<alphabets.length; i++) {
			for(int j=0; j<alphabets[i].length; j++) {
				alphabets[i][j] = ch; 
				ch++;
				System.out.print(alphabets[i][j]+"  ");
			}
			System.out.println();
		}
		
	
	
	}

}
