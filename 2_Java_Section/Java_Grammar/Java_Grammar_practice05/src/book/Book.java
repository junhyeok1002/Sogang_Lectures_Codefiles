// ��� �Ӽ��� private, �θ� �޼ҵ�� �ڽ��� ������ �� �ְ� protected

package book;

//package, import �ʿ��� �κ� �߰��� ��

public class Book {
	private int code;  // å �ڵ�
	private String title; // å ����              
	// ������, �޼ҵ� �߰��� ��. }
	
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