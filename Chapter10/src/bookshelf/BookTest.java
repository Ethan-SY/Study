package bookshelf;

public class BookTest {

	public static void main(String[] args) {

		Queue shelfQueue = new BookShelf();   // 순서대로 들어가고 나온다.
		shelfQueue.enQueue("태백산맥1");
		shelfQueue.enQueue("태백산맥2");
		shelfQueue.enQueue("태백산맥3");
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}

}
