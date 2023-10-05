package personext;

//package, import 필요한 부분 추가할 것
import person.Person;

public class Student extends Person {
	private int code;  // 빌린 책 코드
	//생성자, 메소드 추가할 것.
	
	public Student() {}
	public Student(int no, String name,int code) {
		super(no, name);
		this.code = code;
	}
	public int getcode1(){
		return this.code;
	}
	public int getcode2(){
		return this.code;
	}
}