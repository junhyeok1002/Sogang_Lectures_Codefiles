package bookext;

//package, import �ʿ��� �κ� �߰��� 
import book.*;

public class ComputerBook extends Book { 
	private int stock;  // ��� ��
	// ������, �޼ҵ� �߰��� ��. 
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