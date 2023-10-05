package bookext;

//package, import 필요한 부분 추가할 것
import book.Book;

public class EnglishBook extends Book { 
	private int publishedYear;  // 출판년도
	//생성자, 메소드 추가할 것.
	public EnglishBook(){}
	
	public EnglishBook(int code, String title, int stock){
		super(code, title);
		this.publishedYear = stock;
	}
	
	public void print() {
		System.out.println("["+this.getcode()+"] "+this.gettitle()+" (published : "+this.publishedYear+")");
	}
	public void print2() {
		System.out.println(this.gettitle()+" - code("+this.getcode()+"), published year - ("+this.publishedYear+")");
	}
}
