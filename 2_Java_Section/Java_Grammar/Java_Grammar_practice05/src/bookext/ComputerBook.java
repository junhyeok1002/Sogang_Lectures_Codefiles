package bookext;

//package, import 필요한 부분 추가할 
import book.*;

public class ComputerBook extends Book { 
	private int stock;  // 재고 수
	// 생성자, 메소드 추가할 것. 
	public ComputerBook(){}
	
	public ComputerBook(int code, String title, int stock){
		super(code, title);
		this.stock = stock;
	}
	public void print() {
		System.out.println("["+this.getcode()+"] "+this.gettitle()+" (stock : "+this.stock+")");
	}
	public void print2() {
		System.out.println(this.gettitle()+" - code("+this.getcode()+"), stock - ("+this.stock+")");
	}
}