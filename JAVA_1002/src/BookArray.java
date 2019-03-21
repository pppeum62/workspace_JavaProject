import java.util.*;

class Book{
	String title, author;
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
}

public class BookArray {
	public static void main(String[] args) {
		
		Book book[] = new Book[2];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < book.length; i++) {
			System.out.println("제목 >> ");
			String title = sc.next();
			System.out.println("저자 >> ");
			String author = sc.next();
			book[i] = new Book(title, author);
		}
		
		for(int i = 0; i < book.length; i++)
			System.out.println(book[i].title + " - " + book[i].author);
		
	}

}
