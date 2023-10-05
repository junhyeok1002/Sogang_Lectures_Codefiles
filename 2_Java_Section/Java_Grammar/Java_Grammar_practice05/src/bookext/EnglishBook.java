package bookext;

//package, import �ʿ��� �κ� �߰��� ��
import book.Book;

public class EnglishBook extends Book { 
	private int publishedYear;  // ���ǳ⵵
	//������, �޼ҵ� �߰��� ��.
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
