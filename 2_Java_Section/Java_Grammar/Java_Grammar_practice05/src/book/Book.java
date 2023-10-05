// 모든 속성은 private, 부모 메소드는 자식이 접근할 수 있게 protected

package book;

//package, import 필요한 부분 추가할 것

public class Book {
	private int code;  // 책 코드
	private String title; // 책 제목              
	// 생성자, 메소드 추가할 것. }
	
	public Book(){}
	
	public Book(int code, String title){
		this.code = code;
		this.title = title;
	}
	
	protected void setBook(int code, String title) {
		this.code = code;
		this.title = title;
	}
	public String gettitle() {
		return this.title;
	}
	public int getcode() {
		return this.code;
	}
	public void print(){};
	public void print2(){};
	
	
	
	
}