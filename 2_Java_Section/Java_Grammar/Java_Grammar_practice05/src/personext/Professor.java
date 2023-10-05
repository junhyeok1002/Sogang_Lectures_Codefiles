package personext;

//package, import 필요한 부분 추가할 것
import person.Person;


public class Professor extends Person {
	private int code1;  // 빌린 책 코드 1 
	private int code2;  // 빌린 책 코드 2
	//생성자, 메소드 추가할 것.
	
	public Professor() {}
	public Professor(int no, String name,int c1, int c2) {
		super(no,name);
		this.code1 = c1; 
		this.code2 = c2;
	}
	public int getcode1(){
		return this.code1;
	}
	public int getcode2(){
		return this.code2;
	}
}