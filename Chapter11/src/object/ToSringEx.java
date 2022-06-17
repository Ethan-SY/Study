package object;

class Book{
	String title;
	String author;
	
	Book(String title, String author){
		this.title = title;
		this.author = author;
	}

	@Override
	public String toString() {  //재정의 해서 사용하기 
		return title + "," + author; //아니면 해시 코드값이나옴
	}
	
	
}


public class ToSringEx {

	public static void main(String[] args) {

		Book book = new Book("두잇","은종님");
		System.out.println(book);
		
		String str = new String("test");
		System.out.println(str);
	}

}
