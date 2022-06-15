package inheritance;

public class Circle {
	
	Point point;   // 합성 has - a 관계
	
	private int radius;

	public Circle() {
		point = new Point();
	}
}
